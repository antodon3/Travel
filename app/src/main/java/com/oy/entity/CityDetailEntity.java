package com.oy.entity;

import com.oy.adapter.TypeMoreAdapter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/10/4.
 */
public class CityDetailEntity{



    /**
     * type : WikiDestination
     * title : 攻略
     * url : null
     * photo_url : http://inspiration.chanyouji.cn/GoodsIcon/48/攻略.png
     * wiki_destination : {"id":23,"name_zh_cn":"北京","children_count":1,"created_at":"2016-03-03T07:58:25.000Z","updated_at":"2016-03-03T07:58:25.000Z","name_en":"Beijing","image_url":"http://m.chanyouji.cn/destinations/23-landscape.jpg"}
     */

    private List<GoodsBean> goods;
    /**
     * id : 109
     * lat : 25.0454006195
     * lng : 102.7099990845
     * district_id : 100007
     * parent_id : 5
     * name : 云南
     * name_en : Yunnan
     * name_pinyin : yun nan|yn
     * score : 1165
     * level : 3
     * path : .1.5.109.
     * published : true
     * is_in_china : true
     * inspiration_activities_count : 0
     * activity_collections_count : 0
     * wishes_count : 0
     * wiki_destination_id : null
     * photo_url : http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg
     * title :
     * description :
     * tip : 最新云南游玩指南，含徒步、租车自驾及美食购物等攻略
     * time_cost :
     * wiki_page_id : null
     * has_airport : false
     * visit_tip :
     * is_top_destination : true
     * is_in_grouping : false
     * alias_name : null
     * travel_tip : null
     * photo : {"id":66760,"width":1192,"height":1067,"url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg","file_size":1088794,"photo_url":"http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg"}
     */

    private String name;
    private String name_en;
    private String photo_url;
    /**
     * count : 8
     * type : Destination
     * button_text : 概览与地图
     * title : 北京目的地
     * models : [{"id":665,"lat":39.9412994385,"lng":116.0999984741,"district_id":120093,"parent_id":93,"name":"门头沟","name_en":"Mentougou","name_pinyin":"men tou gou|mtg","score":60,"level":4,"path":".1.5.93.665.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/665/e92e0061733667dd361049bc6101c476.jpg","title":"古村禅寺寻幽","description":"位于北京西部的门头沟区，多山是它的特色，境内有北京最高峰东灵山，次高峰百花山；还有潭柘寺和戒台寺京西两大佛教寺庙；此外古村也众多，《爸爸去哪儿》的录制地灵水村，电影《投名状》取景地爨底下村等。\r\n\r\n门头沟的古村禅寺之旅，一般安排2-3天。从北京苹果园公交站，换乘892、931路公交车，可直达门头沟多个景区。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"距离北京30公里，建议游玩2-3天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":435234,"width":980,"height":588,"url":"http://inspiration.chanyouji.cn/Destination/665/e92e0061733667dd361049bc6101c476.jpg","file_size":477578,"photo_url":"http://inspiration.chanyouji.cn/Destination/665/e92e0061733667dd361049bc6101c476.jpg"}},{"id":666,"lat":40.220500946,"lng":116.2310028076,"district_id":143881,"parent_id":93,"name":"昌平","name_en":"Changping","name_pinyin":"chang ping|cp","score":50,"level":4,"path":".1.5.93.666.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/666/c619262b964ced00daa96925626ff5cd.jpg","title":"古迹众多的温泉乡","description":"首都的北大门昌平区，区内文物古迹众多，自然风景优美。不仅有驰名中外的明十三陵、\u201c天下第一雄关\u201d居庸关，温泉古镇小汤山，还有航空博物馆、蟒山、天翼草莓园等亲子游好去处。\r\n\r\n小汤山是著名的温泉乡，选一个温泉酒店，在昌平住1天玩2天是不错的选择。从北京市区搭乘地铁昌平线、5号线、8号线、13号线、昌8联络线，均可到达昌平区。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"距离北京33公里，建议游玩1-2天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":435231,"width":1024,"height":614,"url":"http://inspiration.chanyouji.cn/Destination/666/c619262b964ced00daa96925626ff5cd.jpg","file_size":1108028,"photo_url":"http://inspiration.chanyouji.cn/Destination/666/c619262b964ced00daa96925626ff5cd.jpg"}},{"id":667,"lat":40.3339996338,"lng":116.6309967041,"district_id":120418,"parent_id":93,"name":"怀柔","name_en":"Huairou","name_pinyin":"huai rou|hr","score":40,"level":4,"path":".1.5.93.667.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/667/dc62e2eb048edf544d7e3f09d8032bff.jpg","title":"山明水秀的\u201c京郊明珠\u201d","description":"距离北京市区3小时车程的怀柔区，素有\u201c京郊明珠\u201d之誉，旅游资源非常丰富，拥有风景独秀的慕田峪长城，\u201c北方小黄山\u201d云蒙山，京北第一古刹红螺寺，还可参加漂流、滑雪等观光项目。\r\n\r\n游览怀柔的长城古寺，安排1-2天行程即可。从东直门北站，有916路快车、867路、936路公交车可直达怀柔汽车站。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"距离北京40公里，建议游玩1-2天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":435228,"width":730,"height":438,"url":"http://inspiration.chanyouji.cn/Destination/667/dc62e2eb048edf544d7e3f09d8032bff.jpg","file_size":497438,"photo_url":"http://inspiration.chanyouji.cn/Destination/667/dc62e2eb048edf544d7e3f09d8032bff.jpg"}},{"id":664,"lat":40.4566993713,"lng":115.9749984741,"district_id":770,"parent_id":93,"name":"延庆","name_en":"Yanqing","name_pinyin":"yan qing|yq","score":30,"level":4,"path":".1.5.93.664.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/664/40c02afef0a6a3a8c95eece6e422bf04.jpg","title":"北京著名的避暑胜地","description":"延庆县地处北京市西北部，举世闻名的八达岭长城就座落于延庆境内；除此之外，还有我国规模最大的古崖居遗址，\u201c塞外小漓江\u201d龙庆峡，徒步穿越天堂海坨山，还有广袤的康西草原。\r\n\r\n延庆还是北京境内著名的避暑胜地，夏季有消夏避暑节，冬季有冰灯、冰雪节活动。延庆经典行程可安排2-3天，从北京德胜门搭乘919路，或西直门乘S2线，可直达延庆县城汽车站。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"距离北京74公里，建议游玩2-3天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":435236,"width":1464,"height":879,"url":"http://inspiration.chanyouji.cn/Destination/664/40c02afef0a6a3a8c95eece6e422bf04.jpg","file_size":767684,"photo_url":"http://inspiration.chanyouji.cn/Destination/664/40c02afef0a6a3a8c95eece6e422bf04.jpg"}},{"id":190,"lat":40.6511001587,"lng":117.2740020752,"district_id":1446421,"parent_id":93,"name":"密云古北水镇","name_en":"Gubei Water Town","name_pinyin":"mi yun gu bei shui zhen|mygbsz","score":25,"level":4,"path":".1.5.93.190.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/190/d85c9db01fff54c8c60dec082ec0c1e6.jpg","title":"北方的乌镇","description":"古北水镇位于密云县东北侧，是京郊难得的水乡古镇，有\u201c北方的乌镇\u201d之称。镇上保留了许多古色古香的宅院建筑，还有\u201c司马小烧\u201d、\u201c永顺染坊\u201d、\u201c镇远镖局\u201d等特色景点，仿佛闯进古装剧里的场景。\r\n\r\n古镇西端与司马台长城景区相连，两者一并游玩可安排1-2天时间。东直门坐980路到密云汽车站，转乘51路到司马台村下车即可抵达古北水镇，全程约1.5小时车程。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"距离北京150公里，建议游玩1-2天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":435219,"width":720,"height":432,"url":"http://inspiration.chanyouji.cn/Destination/190/d85c9db01fff54c8c60dec082ec0c1e6.jpg","file_size":347924,"photo_url":"http://inspiration.chanyouji.cn/Destination/190/d85c9db01fff54c8c60dec082ec0c1e6.jpg"}},{"id":619,"lat":40.8244018555,"lng":114.8880004883,"district_id":497,"parent_id":93,"name":"张家口","name_en":"Zhangjiakou","name_pinyin":"zhang jia kou|zjk","score":20,"level":4,"path":".1.5.93.619.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/619/6f7abdabdc5aa1c5cbdf4aedd1ec772d.jpg","title":"北京的后花园","description":"张家口地处京晋冀蒙交界处，拥里有长城四大关口之一的大境门，河北最高的小五台山，中国的\u201c66号公路\u201d草原天路等景点，冬天还是理想的滑雪胜地，因此享有\u201c北京的后花园\u201d之美誉。\r\n\r\n张家口一年四季都适合游览，但6月至9月的草原风光最为秀丽。而想要体验张家口的塞外风情，安排2-3天行程即可，从北京坐火车约3、4小时可到张家口。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":true,"visit_tip":"距离北京200公里，建议游玩2-3天","is_top_destination":false,"is_in_grouping":true,"alias_name":"","travel_tip":"","photo":{"id":435257,"width":1600,"height":960,"url":"http://inspiration.chanyouji.cn/Destination/619/6f7abdabdc5aa1c5cbdf4aedd1ec772d.jpg","file_size":721080,"photo_url":"http://inspiration.chanyouji.cn/Destination/619/6f7abdabdc5aa1c5cbdf4aedd1ec772d.jpg"}},{"id":620,"lat":40.9770011902,"lng":117.93699646,"district_id":135,"parent_id":93,"name":"承德","name_en":"Chengde","name_pinyin":"cheng de|cd","score":15,"level":4,"path":".1.5.93.620.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/620/c9d52e0d7cea389af69508f551bd9a9e.jpg","title":"风景如画的塞外夏都","description":"\u201c塞外夏都\u201d承德位于河北省，不仅拥有世界文化遗产避暑山庄及周边寺庙群\u201c八大庙\u201d等名胜，还有世界最大的皇家狩猎场木兰围场，人少景美的金山岭长城，旅游资源可谓非常丰富。\r\n\r\n5-9月是承德旅游的最佳季节，一般可安排2-3天行程。北京站和北京北站均有火车至承德，车程约5-6小时。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":false,"visit_tip":"距离北京230公里，建议游玩2-3天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":435252,"width":1448,"height":869,"url":"http://inspiration.chanyouji.cn/Destination/620/c9d52e0d7cea389af69508f551bd9a9e.jpg","file_size":1402681,"photo_url":"http://inspiration.chanyouji.cn/Destination/620/c9d52e0d7cea389af69508f551bd9a9e.jpg"}},{"id":618,"lat":39.9353981018,"lng":119.5999984741,"district_id":132,"parent_id":93,"name":"秦皇岛","name_en":"Qinhuangdao","name_pinyin":"qin huang dao|qhd","score":10,"level":4,"path":".1.5.93.618.","published":true,"is_in_china":true,"inspiration_activities_count":0,"activity_collections_count":0,"wishes_count":0,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/618/f3377e6074cbbd2fee102db7ad5481e2.jpg","title":"著名的海滨度假胜地","description":"秦皇岛，唯一一个以皇帝尊号命名的城市。这里拥有\u201c天下第一关\u201d山海关，万里长城的起点\u201c老龙头\u201d，还有国内最著名的海滨度假胜地北戴河，兼具人文自然风情。\r\n\r\n秦皇岛经典行程一般安排2-3天，1天游览山海关、老龙头，1-2天在北戴河或南戴河度假区享受海滨风情。从北京坐火车，约2-3小时可到达秦皇岛。","tip":"","time_cost":"","wiki_page_id":null,"has_airport":true,"visit_tip":"距离北京300公里，建议游玩2-3天","is_top_destination":false,"is_in_grouping":true,"alias_name":"","travel_tip":"","photo":{"id":435260,"width":1600,"height":960,"url":"http://inspiration.chanyouji.cn/Destination/618/f3377e6074cbbd2fee102db7ad5481e2.jpg","file_size":882984,"photo_url":"http://inspiration.chanyouji.cn/Destination/618/f3377e6074cbbd2fee102db7ad5481e2.jpg"}}]
     */

    private List<SectionsBean> sections;


    public List<GoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsBean> goods) {
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public List<SectionsBean> getSections() {
        return sections;
    }

    public void setSections(List<SectionsBean> sections) {
        this.sections = sections;
    }

    public static class GoodsBean {
        private String type;
        private String title;
        private String photo_url;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPhoto_url() {
            return photo_url;
        }

        public void setPhoto_url(String photo_url) {
            this.photo_url = photo_url;
        }
    }

    public static class SectionsBean implements TypeMoreAdapter.OnType {
        private int count;
        private int type;
        private String button_text;
        private String title;
        /**
         * id : 665
         * lat : 39.9412994385
         * lng : 116.0999984741
         * district_id : 120093
         * parent_id : 93
         * name : 门头沟
         * name_en : Mentougou
         * name_pinyin : men tou gou|mtg
         * score : 60
         * level : 4
         * path : .1.5.93.665.
         * published : true
         * is_in_china : true
         * inspiration_activities_count : 0
         * activity_collections_count : 0
         * wishes_count : 0
         * wiki_destination_id : null
         * photo_url : http://inspiration.chanyouji.cn/Destination/665/e92e0061733667dd361049bc6101c476.jpg
         * title : 古村禅寺寻幽
         * description : 位于北京西部的门头沟区，多山是它的特色，境内有北京最高峰东灵山，次高峰百花山；还有潭柘寺和戒台寺京西两大佛教寺庙；此外古村也众多，《爸爸去哪儿》的录制地灵水村，电影《投名状》取景地爨底下村等。

         门头沟的古村禅寺之旅，一般安排2-3天。从北京苹果园公交站，换乘892、931路公交车，可直达门头沟多个景区。
         * tip :
         * time_cost :
         * wiki_page_id : null
         * has_airport : false
         * visit_tip : 距离北京30公里，建议游玩2-3天
         * is_top_destination : false
         * is_in_grouping : true
         * alias_name : null
         * travel_tip : null
         * photo : {"id":435234,"width":980,"height":588,"url":"http://inspiration.chanyouji.cn/Destination/665/e92e0061733667dd361049bc6101c476.jpg","file_size":477578,"photo_url":"http://inspiration.chanyouji.cn/Destination/665/e92e0061733667dd361049bc6101c476.jpg"}
         */

        private List<ModelsBean> models;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
        @Override
        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getButton_text() {
            return button_text;
        }

        public void setButton_text(String button_text) {
            this.button_text = button_text;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<ModelsBean> getModels() {
            return models;
        }

        public void setModels(List<ModelsBean> models) {
            this.models = models;
        }

        public static class ModelsBean implements TypeMoreAdapter.OnType {
            private int id;
            private String name;
            private String name_en;
            private String photo_url;
            private String title;
            private String description;
            private String visit_tip;
            private String days_count;
            private String topic;
            private String summary;
            /**
             * id : 519315
             * plan_id : 111814
             * position : 1
             * description : 丽江和大理是云南最重要的两大旅行地，适合用4天时间紧凑的游览一遍，既可以闲逛风情独特的丽江、大理古城，也可以欣赏玉龙雪山、洱海的绝美风光。

             #第一天行程#
             今日来一场悠闲的丽江古城漫步游，感受最柔软舒适的古城时光吧。不大的丽江古城中，包含着纳西族皇宫木府、开满小吃铺子的四方街、灯火酒绿的艳遇酒吧等各种元素。
             * points : [{"id":1159238,"position":0,"time_cost":30,"is_custom":false,"poi":{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2628,"visit_tip":"半小时","address":"丽江市古城区大研古镇北入口","topic":"和大水车合影留念","introduce":"走进丽江古城北门，一大一小两架水车便映入眼帘。这两驾连轴大水车是古城的标志性建筑，也是古城内最人声鼎沸的地方，一年四季都挤满了留影和集合的游客，想要单独和水车合影一张必须眼尖手快。\r\n\r\n大水车前的石桥上，是拍摄水车的最佳地点。若是春天的傍晚前来，夕阳穿过水车，照射在一旁刻有江泽民题词的照壁上，碧绿的垂柳被微风拂动，潺潺的流水反射着碎金般的阳光，是大水车最美的一面。","time_cost":30,"wishes_count":9054,"icon_type":2,"price":0,"user_activities_count":0,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230208,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。\r\n\r\n每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86497,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60937.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"大水车","name_en":"","name_pinyin":"gu cheng da shui che","business_id":60937,"poi_type":"SIGHT","district_id":32,"lat":26.876254,"lng":100.233196,"address":"丽江市古城区大研古镇入口","location_name":null,"blat":26.8819236755,"blng":100.2398870929,"youji_lat":26.876254,"youji_lng":100.233196,"youji_poi_id":161006,"youji_poi_name":"大水车","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":3100,"height":1859,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2628/a91ffe19de19dfad741e65c15f1861b0.jpg?imageMogr2/crop/!3100x1859a0a141/thumbnail/800"}}},{"id":1159239,"position":1,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2617,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"逛四方街品尝纳西美食","introduce":"丽江虽然不以美食而著称，但是却有很多有纳西族代表性的特色小吃，这其中以鸡豆凉粉、纳西烤鱼、丽江粑粑等最受欢迎。走在丽江古城的四方街上，短短的街道上有数十家小吃店，让你一次吃遍各种纳西小吃。\r\n\r\n除了小吃外，丽江特色火锅也非常出名，以腊排骨火锅、洋芋鸡火锅、黑山羊火锅、菌类火锅等最美味。丽江的火锅有招牌蘸水，最好可以放一些薄荷涮在肉锅里，肉会带有清新的香味，薄荷混了肉味，非常好吃。\r\n\r\n若要想吃正宗纳西菜，比较具有代表性的有三叠水和八大碗。\u201c三叠水\u201d是纳西人的最高礼仪，按所上菜看的口味分三次上席；\u201c八大碗\u201d则是纳西族传统的年夜饭，以八种各有寓意的菜式致以美好祝福。","time_cost":30,"wishes_count":10127,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230208,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。\r\n\r\n每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2299/f4a2239dcadaf5104dc430cd339ad0c0.jpg?imageMogr2/crop/!1600x959a0a54/thumbnail/800"}}},{"id":1159240,"position":2,"time_cost":30,"is_custom":false,"poi":{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2286,"visit_tip":"半小时","address":"丽江市古城区新华街狮子山公园","topic":"登狮子山俯瞰丽江古城全景","introduce":"丽江古城西侧的狮子山顶，是观赏丽江古城全景的最佳去处，可北望玉龙雪山，东俯丽江古城，西瞰丽江新城，南眺田园风光。晚上在狮子山俯瞰丽江，月色下在万家灯火装点下的古城更是流光溢彩，璀璨动人。\r\n\r\n狮子山因山体宛如一头睡卧的狮子而得名，山顶坐落着极富建筑特色的万古楼，是丽江城内的制高点。公园南端有始建于乾隆十九年的白马龙潭寺，寺东有一泓清澈见底的潭水，被纳西人民奉为神泉。","time_cost":30,"wishes_count":9996,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230208,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。\r\n\r\n每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":10543884,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/128246.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"狮子山","name_en":"","name_pinyin":"shi zi shan gong yuan","business_id":128246,"poi_type":"SIGHT","district_id":32,"lat":26.871291,"lng":100.231285,"address":"丽江市古城区新华街","location_name":null,"blat":26.8772544861,"blng":100.237780896,"youji_lat":26.871291,"youji_lng":100.231285,"youji_poi_id":6400,"youji_poi_name":"狮子山","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2286/962cf8d20eb94a5908c45e399fba2a80.jpg?imageMogr2/crop/!1600x959a0a61/thumbnail/800"}}},{"id":1159241,"position":3,"time_cost":60,"is_custom":false,"poi":{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 ?","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2612,"visit_tip":"1小时","address":"丽江市古城区大研镇光义街官院巷49号","topic":"木府：精致雄伟的丽江王府","introduce":"丽江古城内的木府，是历代丽江木氏土司的王府。土司府在保持了中原建筑风格的基础上，添加了白族和纳西族的工艺，建筑精美而宏大，蔚为壮观，难怪徐霞客当年在木府门外慨叹：\u201c宫室之丽，拟于王者\u201d。\r\n\r\n木府虽是土司王府，但宫室之瑰丽，不逊皇家，据说当年既是\u201c仿紫禁城而建\u201d，鼎盛时期，有宫舍100多间。府内中轴线上建有忠义牌坊、木牌坊、议事厅、万卷楼等建筑，高低错落，气势磅礴。\r\n\r\n木府历经几百年的辉煌，大部分毁于清末的战火中，目前所见的绝大多数是1999年重建而成。虽是重建，但不妨碍其成为丽江古城内的代表性建筑。电视连续剧《木府风云》、《钱王》都是在这里拍摄的。","time_cost":60,"wishes_count":9277,"icon_type":2,"price":0,"user_activities_count":2,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230208,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。\r\n\r\n每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":78639,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/12325.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"木府","name_en":"","name_pinyin":"mu fu","business_id":12325,"poi_type":"SIGHT","district_id":32,"lat":26.869557,"lng":100.234204,"address":"丽江市古城区大研镇光义街官院巷49号 ?","location_name":null,"blat":26.8755760193,"blng":100.2405288786,"youji_lat":26.869557,"youji_lng":100.234204,"youji_poi_id":6396,"youji_poi_name":"木府","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1600,"height":959,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2612/f2129eeb0a93826ad76f3a83addabdd3.jpg?imageMogr2/crop/!1600x959a0a110/thumbnail/800"}}},{"id":1159242,"position":4,"time_cost":30,"is_custom":false,"poi":{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2774,"visit_tip":"半小时","address":"云南丽江市大研古城四方街","topic":"跳一次纳西广场舞","introduce":"每逢节庆日，丽江的纳西族的小伙子都要面对玉龙雪山，敲着\u201c东巴鼓\u201d，跳起欢快的东巴舞。如今在四方街上，几乎每天都有穿着民族服饰欢快起舞的纳西族，和他们一起跳一次广场舞，绝对会是难得的体验。\r\n\r\n东巴舞是纳西族东巴文化的重要组成部分，一般运用于宗教祭祀活动中。东巴舞来源于古代纳西的社会生活，不少动作都是模拟各种动物的动作来进行的，形象十分生动。","time_cost":30,"wishes_count":7788,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230208,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。\r\n\r\n每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":86495,"h5_url":"http://m.ctrip.com/webapp/you/sight/32/60935.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"四方街","name_en":"","name_pinyin":"si fang jie","business_id":60935,"poi_type":"SIGHT","district_id":32,"lat":26.872026,"lng":100.233444,"address":"丽江市古城区大研古镇中心，七一街、五一街、新华街和东大街的交汇处","location_name":null,"blat":26.8778915405,"blng":100.2404404798,"youji_lat":26.872026,"youji_lng":100.233444,"youji_poi_id":6405,"youji_poi_name":"四方街","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":640,"height":384,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2774/b981f042f97f88922712b9e2d2e489a3.jpg?imageMogr2/crop/!640x384a0a149/thumbnail/800"}}},{"id":1159243,"position":5,"time_cost":0,"is_custom":false,"poi":{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null},"inspiration_activity":{"id":2659,"visit_tip":"","address":"古城区五一街王家庄巷41号","topic":"泡一泡丽江酒吧","introduce":"如果说白天的丽江古城是民俗与美景的结合，那么夜幕降临后的丽江则不负其\u201c艳遇之都\u201d的美誉。古城内大大小小的酒吧纷纷开张，在鲜艳的霓虹灯下，素不相识的人们聚在一起，饮酒作乐。\r\n\r\n丽江城内酒吧众多，最具特色的当属火塘酒吧了。火塘是藏区家中生火取暖、聚会的地方，一年365天都不会熄灭。在火塘酒吧中，歌手和客人围坐在火塘周边，自弹自唱、谈天说地、其乐融融。\r\n\r\n江湖酒吧是丽江最热门的火塘音乐酒吧，也是音乐爱好者们在丽江的聚集点之一。江湖酒吧的主唱小松声音穿透力很强，伴随着让人回味无穷的音乐声，不大的酒吧中男男女女围着一个大火塘谈笑风生，十分惬意。","time_cost":0,"wishes_count":9452,"icon_type":2,"price":0,"user_activities_count":1,"destination":{"id":111,"lat":26.8768005371,"lng":100.2300033569,"district_id":32,"parent_id":109,"name":"丽江","name_en":"Lijiang","name_pinyin":"li jiang|lj","score":100,"level":4,"path":".1.5.109.111.","published":true,"is_in_china":true,"inspiration_activities_count":93,"activity_collections_count":13,"wishes_count":230208,"wiki_destination_id":null,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","title":"雪山下的柔美小城","description":"丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。\r\n\r\n每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。","tip":"最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略","time_cost":"","wiki_page_id":18582,"has_airport":true,"visit_tip":"建议游玩3-4天","is_top_destination":false,"is_in_grouping":true,"alias_name":null,"travel_tip":null,"photo":{"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"},"wiki_page":{"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}},"pois":[{"id":16955515,"h5_url":"http://m.ctrip.com/webapp/you/foods/32/8589047.html?popup=close&autoawaken=close&allianceid=309340&sid=788076&ouid=","name":"江湖酒吧","name_en":"","name_pinyin":"JIANG HU JIU BA","business_id":8589047,"poi_type":"RESTAURANT","district_id":32,"lat":26.870921,"lng":100.239741,"address":"古城区五一街王家庄巷41号","location_name":null,"blat":26.8767719269,"blng":100.2462710821,"youji_lat":26.870921,"youji_lng":100.239741,"youji_poi_id":171072,"youji_poi_name":"江湖酒吧","is_in_china":true,"local_name":null,"local_address_name":null}],"activity_collections":[{"id":449,"topic":"丽江古城"}],"photo":{"width":1280,"height":767,"photo_url":"http://inspiration.chanyouji.cn/InspirationActivity/2323/f8a55533b79eef5686a3f20b5d5267a0.jpg?imageMogr2/crop/!1280x767a0a192/thumbnail/800"}}}]
             */

            private List<DaysBean> days;

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getTopic() {
                return topic;
            }

            public void setTopic(String topic) {
                this.topic = topic;
            }

            /**
             * id : 375262
             * caption : null
             * photo_url : http://inspiration.chanyouji.cn/UserActivityContent/375262/57fa8f039a89d3de81766eb79ea8adc4.jpg
             * position : 0
             * width : 900
             * height : 1600
             */

            private List<ContentsBean> contents;


            public String getDays_count() {
                return days_count;
            }

            public void setDays_count(String days_count) {
                this.days_count = days_count;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhoto_url() {
                return photo_url;
            }

            public void setPhoto_url(String photo_url) {
                this.photo_url = photo_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getVisit_tip() {
                return visit_tip;
            }

            public void setVisit_tip(String visit_tip) {
                this.visit_tip = visit_tip;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public List<ContentsBean> getContents() {
                return contents;
            }

            public void setContents(List<ContentsBean> contents) {
                this.contents = contents;
            }

            @Override
            public int getType() {
                return 0;
            }

            public List<DaysBean> getDays() {
                return days;
            }

            public void setDays(List<DaysBean> days) {
                this.days = days;
            }

            public static class ContentsBean implements Serializable {
                private int id;
                private String photo_url;
                private int position;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getPhoto_url() {
                    return photo_url;
                }

                public void setPhoto_url(String photo_url) {
                    this.photo_url = photo_url;
                }

                public int getPosition() {
                    return position;
                }

                public void setPosition(int position) {
                    this.position = position;
                }
            }

            public static class DaysBean {
                private int id;
                private int plan_id;
                private int position;
                private String description;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getPlan_id() {
                    return plan_id;
                }

                public void setPlan_id(int plan_id) {
                    this.plan_id = plan_id;
                }

                public int getPosition() {
                    return position;
                }

                public void setPosition(int position) {
                    this.position = position;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }
            }
        }
    }
}
