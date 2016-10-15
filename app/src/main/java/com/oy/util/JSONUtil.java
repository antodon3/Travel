package com.oy.util;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oy.entity.CityDetailEntity;
import com.oy.entity.CityEntity;
import com.oy.entity.PlansDetailEntity;
import com.oy.entity.TripEntity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/1.
 */
public class JSONUtil {
    //解析homefragment头部图片
    public static List<String> getHeaderImage(String json){
        try {
            JSONArray jsonArray = new JSONObject(json).getJSONArray("data");
            List<String> photoList = new ArrayList<>();
            photoList.add(jsonArray.getJSONObject(0).getJSONObject("photo").getString("photo_url"));
            photoList.add(jsonArray.getJSONObject(1).getJSONObject("photo").getString("photo_url"));
            return photoList;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    //解析旅游城市
    public static List<CityEntity> getCity(String json){
        try {
            JSONArray jsonArray = new JSONObject(json).getJSONArray("data");
            TypeToken<List<CityEntity>> tt = new TypeToken<List<CityEntity>>(){};
            return new Gson().fromJson(jsonArray.toString(), tt.getType());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    //解析游记列表
    public static List<TripEntity> getTrip(String json){
        try {
            JSONArray jsonArray = new JSONObject(json).getJSONArray("data");
            TypeToken<List<TripEntity>> tt = new TypeToken<List<TripEntity>>(){};
            return new Gson().fromJson(jsonArray.toString(),tt.getType());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    //解析城市攻略
    public static CityDetailEntity getCityDetail(String json){
        try {
            CityDetailEntity cityDetailEntity = new CityDetailEntity();
            JSONObject jsonObject = new JSONObject(json).getJSONObject("data");
            JSONObject jo = jsonObject.getJSONObject("destination");
            //添加城市名和图片
            String cityname = jo.getString("name");
            String cityname_en = jo.getString("name_en");
            String photo_url = jo.getString("photo_url");
            cityDetailEntity.setName(cityname);
            cityDetailEntity.setName_en(cityname_en);
            cityDetailEntity.setPhoto_url(photo_url);
            //解析goods
            JSONArray jsonArray = jsonObject.getJSONArray("goods");
            TypeToken<List<CityDetailEntity.GoodsBean>> tt = new TypeToken<List<CityDetailEntity.GoodsBean>>(){};
            List<CityDetailEntity.GoodsBean> goodsBeans = new Gson().fromJson(jsonArray.toString(), tt.getType());
            cityDetailEntity.setGoods(goodsBeans);
            //解析sections
            JSONArray jsonArray1 = jsonObject.getJSONArray("sections");
            List<CityDetailEntity.SectionsBean> sectionsBeans = new ArrayList<>();
            for (int i = 0;i<jsonArray1.length();i++){
                JSONObject jsonObject1 = jsonArray1.getJSONObject(i);
                //SectionsBean对象
                CityDetailEntity.SectionsBean sectionsBean = new CityDetailEntity.SectionsBean();
                //type title button_text
                String type = jsonObject1.getString("type");
                String title = jsonObject1.getString("title");
                String button_text = jsonObject1.getString("button_text");
                JSONArray jsonArray2 = jsonObject1.getJSONArray("models");
                if (type.equals("Destination")){
                    sectionsBean.setType(0);
                    //解析models---目的地
                        List<CityDetailEntity.SectionsBean.ModelsBean> modelsBeans = new ArrayList<>();
                     for (int k = 0;k< jsonArray2.length();k++){
                        JSONObject jsonObject2 = jsonArray2.getJSONObject(k);
                        CityDetailEntity.SectionsBean.ModelsBean modelsBean = new CityDetailEntity.SectionsBean.ModelsBean();

                        modelsBean.setName(jsonObject2.getString("name"));
                        modelsBean.setName_en(jsonObject2.getString("name_en"));
                        modelsBean.setPhoto_url(jsonObject2.getString("photo_url"));
                        modelsBeans.add(modelsBean);
                    }
                    sectionsBean.setModels(modelsBeans);
                }
                else if (type.equals("Plan")){
                    sectionsBean.setType(1);
                    //解析models---经典路线
                    List<CityDetailEntity.SectionsBean.ModelsBean> modelsBeans = new ArrayList<>();
                    for (int k = 0;k< jsonArray2.length();k++){
                        JSONObject jsonObject2 = jsonArray2.getJSONObject(k);
                        CityDetailEntity.SectionsBean.ModelsBean modelsBean = new CityDetailEntity.SectionsBean.ModelsBean();
                        String title1 = jsonObject2.getString("title");
                        String days_count = jsonObject2.getString("days_count");
                        modelsBean.setTitle(title1);
                        modelsBean.setDays_count(days_count);
                        //添加days
                        JSONArray jsonArray7 = jsonArray2.getJSONObject(k).getJSONArray("days");
                        TypeToken<List<CityDetailEntity.SectionsBean.ModelsBean.DaysBean>> dd = new TypeToken<List<CityDetailEntity.SectionsBean.ModelsBean.DaysBean>>(){};
                        modelsBean.setDays((List<CityDetailEntity.SectionsBean.ModelsBean.DaysBean>) new Gson().fromJson(jsonArray7.toString(), dd.getType()));
                        modelsBeans.add(modelsBean);
                    }
                    sectionsBean.setModels(modelsBeans);
                }
                else if (type.equals("SearchActivityCollectionDestinationEntity")){
                    sectionsBean.setType(2);
                    //解析models---旅行榜单
                    List<CityDetailEntity.SectionsBean.ModelsBean> modelsBeans = new ArrayList<>();
                    for (int k = 0;k< jsonArray2.length();k++){
                        JSONObject jsonObject2 = jsonArray2.getJSONObject(k);
                        CityDetailEntity.SectionsBean.ModelsBean modelsBean = new CityDetailEntity.SectionsBean.ModelsBean();
                        modelsBean.setTitle(jsonObject2.getString("title"));
                        modelsBean.setSummary(jsonObject2.getString("summary"));
                        modelsBean.setPhoto_url(jsonObject2.getJSONObject("photo").getString("url"));
                        modelsBeans.add(modelsBean);
                    }
                    sectionsBean.setModels(modelsBeans);

                }
                else if (type.equals("UserActivity")){
                    sectionsBean.setType(3);
                    //解析models---相关氢游记
                    List<CityDetailEntity.SectionsBean.ModelsBean> modelsBeans = new ArrayList<>();
                    for (int k = 0;k< jsonArray2.length();k++){
                        JSONObject jsonObject2 = jsonArray2.getJSONObject(k);
                        CityDetailEntity.SectionsBean.ModelsBean modelsBean = new CityDetailEntity.SectionsBean.ModelsBean();
                        String topic = jsonObject2.getString("topic");
                        modelsBean.setTopic(topic);
                        String description = jsonObject2.getString("description");
                        modelsBean.setDescription(description);
                        JSONArray jsonArray3 = jsonObject2.getJSONArray("contents");
                        TypeToken<List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean>> tt2 = new TypeToken<List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean>>(){};
                        modelsBean.setContents((List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean>) new Gson().fromJson(jsonArray3.toString(), tt2.getType()));
                        String name = jsonObject2.getJSONObject("user").getString("name");
                        modelsBean.setName(name);
                        modelsBeans.add(modelsBean);
                    }
                    sectionsBean.setModels(modelsBeans);

                }
                sectionsBean.setTitle(title);
                sectionsBean.setButton_text(button_text);


                sectionsBeans.add(sectionsBean);
                cityDetailEntity.setSections(sectionsBeans);
            }
            return cityDetailEntity;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    //行程详情解析
    public static PlansDetailEntity getPlansDetail(String json){
        try {
            PlansDetailEntity plansDetailEntity = new PlansDetailEntity();
            JSONObject jsonObject = new JSONObject(json).getJSONObject("data");
            plansDetailEntity.setId(jsonObject.getInt("id"));
            plansDetailEntity.setDestination_id(jsonObject.getInt("destination_id"));
            plansDetailEntity.setTitle(jsonObject.getString("title"));
            //目的城市名字
            plansDetailEntity.setDestination_name(jsonObject.getJSONObject("destination").getString("name"));
            TypeToken<List<PlansDetailEntity.DaysBean>> tt = new TypeToken<List<PlansDetailEntity.DaysBean>>(){};
            JSONArray jsonArray = jsonObject.getJSONArray("days");
            plansDetailEntity.setDays((List<PlansDetailEntity.DaysBean>) new Gson().fromJson(jsonArray.toString(),tt.getType()));
            return plansDetailEntity;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
