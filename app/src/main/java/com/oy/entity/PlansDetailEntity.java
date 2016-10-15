package com.oy.entity;

import com.oy.adapter.TypeMoreAdapter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public class PlansDetailEntity implements Serializable {


    private int id;
    private int destination_id;
    private String title;
    private static String destination_name;

    public String getDestination_name() {
        return destination_name;
    }

    public void setDestination_name(String destination_name) {
        this.destination_name = destination_name;
    }

    private List<DaysBean> days;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public void setDestination_id(int destination_id) {
        this.destination_id = destination_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<DaysBean> getDays() {
        return days;
    }

    public void setDays(List<DaysBean> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "PlansDetailEntity{" +
                "id=" + id +
                ", destination_id=" + destination_id +
                ", title='" + title + '\'' +
                ", days=" + days +
                '}';
    }

    public static class DaysBean implements TypeMoreAdapter.OnType,Serializable{
        private int id;
        private int plan_id;
        private int position;
        private String description;
        public String getDestination_name(){
            return PlansDetailEntity.destination_name;
        }
        private List<PointsBean> points;

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

        public List<PointsBean> getPoints() {
            return points;
        }

        public void setPoints(List<PointsBean> points) {
            this.points = points;
        }

        @Override
        public int getType() {
            return 0;
        }

        public static class PointsBean implements TypeMoreAdapter.OnType,Serializable{
            private int id;
            private int position;
            private int time_cost;
            private boolean is_custom;

            private PoiBean poi;
            private InspirationActivityBean inspiration_activity;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public int getTime_cost() {
                return time_cost;
            }

            public void setTime_cost(int time_cost) {
                this.time_cost = time_cost;
            }

            public boolean isIs_custom() {
                return is_custom;
            }

            public void setIs_custom(boolean is_custom) {
                this.is_custom = is_custom;
            }

            public PoiBean getPoi() {
                return poi;
            }

            public void setPoi(PoiBean poi) {
                this.poi = poi;
            }

            public InspirationActivityBean getInspiration_activity() {
                return inspiration_activity;
            }

            public void setInspiration_activity(InspirationActivityBean inspiration_activity) {
                this.inspiration_activity = inspiration_activity;
            }

            @Override
            public int getType() {
                return 0;
            }

            public static class PoiBean implements Serializable, TypeMoreAdapter.OnType {
                private int id;
                private String h5_url;
                private String name;
                private String address;
                private String lat;
                private String lng;

                public String getLng() {
                    return lng;
                }

                public void setLng(String lng) {
                    this.lng = lng;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getH5_url() {
                    return h5_url;
                }

                public void setH5_url(String h5_url) {
                    this.h5_url = h5_url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                @Override
                public int getType() {
                    return 0;
                }
            }

            public static class InspirationActivityBean implements Serializable {
                private int id;
                private String visit_tip;
                private String address;
                private String topic;
                private String introduce;
                private int time_cost;
                private int icon_type;
                /**
                 * id : 111
                 * lat : 26.8768005371
                 * lng : 100.2300033569
                 * district_id : 32
                 * parent_id : 109
                 * name : 丽江
                 * name_en : Lijiang
                 * name_pinyin : li jiang|lj
                 * score : 100
                 * level : 4
                 * path : .1.5.109.111.
                 * published : true
                 * is_in_china : true
                 * inspiration_activities_count : 93
                 * activity_collections_count : 13
                 * wishes_count : 230717
                 * wiki_destination_id : null
                 * photo_url : http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg
                 * title : 雪山下的柔美小城
                 * description : 丽江处滇西北高原，是云南最著名的旅行地，以小资的大研古城、宁静的束河古城、风光绝美的玉龙雪山而闻名，其周边还有可以泛舟骑马的拉市海、历史悠久的茶马古道、景色壮丽的虎跳峡等可以一同游玩。

                 每年6-9月是丽江气温最适宜、最适合游玩的季节，通常建议安排3-4天游玩丽江的各个著名景点。国内各主要城市都有直飞丽江的航班。
                 * tip : 最新丽江游玩指南，含特色周边、防坑、徒步玉龙雪山及三江并流等攻略
                 * time_cost :
                 * wiki_page_id : 18582
                 * has_airport : true
                 * visit_tip : 建议游玩3-4天
                 * is_top_destination : false
                 * is_in_grouping : true
                 * alias_name : null
                 * travel_tip : null
                 * photo : {"id":429219,"width":1000,"height":600,"url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg","file_size":645362,"photo_url":"http://inspiration.chanyouji.cn/Destination/111/a92420205b8545d4e81a19344eb06c12.jpg"}
                 * wiki_page : {"id":18582,"destination_id":140,"title":"交通指南","category_type":3,"destination":{"id":140,"name_zh_cn":"丽江","children_count":0,"name_en":"Lijiang","image_url":"http://m.chanyouji.cn/destinations/140-landscape.jpg"}}
                 */

                private DestinationBean destination;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getVisit_tip() {
                    return visit_tip;
                }

                public void setVisit_tip(String visit_tip) {
                    this.visit_tip = visit_tip;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getTopic() {
                    return topic;
                }

                public void setTopic(String topic) {
                    this.topic = topic;
                }

                public String getIntroduce() {
                    return introduce;
                }

                public void setIntroduce(String introduce) {
                    this.introduce = introduce;
                }

                public int getTime_cost() {
                    return time_cost;
                }

                public void setTime_cost(int time_cost) {
                    this.time_cost = time_cost;
                }

                public int getIcon_type() {
                    return icon_type;
                }

                public void setIcon_type(int icon_type) {
                    this.icon_type = icon_type;
                }

                public DestinationBean getDestination() {
                    return destination;
                }

                public void setDestination(DestinationBean destination) {
                    this.destination = destination;
                }

                public static class DestinationBean implements Serializable{
                    private int id;
                    private int district_id;
                    private int parent_id;
                    private String name;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getDistrict_id() {
                        return district_id;
                    }

                    public void setDistrict_id(int district_id) {
                        this.district_id = district_id;
                    }

                    public int getParent_id() {
                        return parent_id;
                    }

                    public void setParent_id(int parent_id) {
                        this.parent_id = parent_id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }
    }
}
