package com.oy.entity;

import com.oy.adapter.TypeMoreAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/10/2.
 */
public class TripEntity implements TypeMoreAdapter.OnType {

    /**
     * id : 102
     * name : 氢大V
     * gender : 1
     * level : 3
     * photo_url : http://inspiration.chanyouji.cn/User/102/8a3f18bf608593df7125a2b2748c8320.jpg
     */

    private UserBean user;
    /**
     * id : 60595
     * made_at : 2016-05-14T16:00:00.000Z
     * likes_count : 1
     * comments_count : 0
     * topic : 阿尔卑斯天堂～瓦莱州
     * contents_count : 9
     * district_id : 45095
     * created_at : 2016-10-02T06:53:33.000Z
     * favorites_count : 0
     * parent_district_id : 100050
     * parent_district_count : 9
     * level : 3
     * description : 瓦莱这一名称源于拉丁语“vallis”，意思是“山谷”。150 公里 长的罗纳河谷横穿该州，从罗纳冰川一直延伸至日内瓦湖。沿途众多迷人 的美丽山谷各具特色，将雄伟的山峰和广袤的平原连为一体。远足的游客 在这里能够更好地欣赏山巅的壮丽风光，山谷中的迷人景色令热爱大自然 的游客流连忘返，登山爱好者则想在这里迎接高山发出的挑战“。
     * contents : [{"id":374043,"caption":"","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374043/9fdb8e28ffc600ff25361770fb9e6e37.jpg","position":0,"width":1600,"height":1068},{"id":374044,"caption":"","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374044/07bd354da246399cef9acc25e147f63b.jpg","position":1,"width":1600,"height":1068},{"id":374045,"caption":"山间飘动的旗云，是瓦莱州雪山的丝带，为这雪山美景更是增色不少。","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374045/edb749ed3e5098ba39e2cc2af667e9aa.jpg","position":2,"width":1600,"height":1068},{"id":374046,"caption":null,"photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374046/5d0ebe93a39e8e8c0cc105e3030c09c5.jpg","position":3,"width":1600,"height":1068},{"id":374047,"caption":"山间经常可以看到山地救援的直升飞机在巡逻，滑雪胜地安全防护还是很到位的。","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374047/bfe17c65603a7f825b4533e2380f75b8.jpg","position":4,"width":1600,"height":1067},{"id":374048,"caption":"终于还是如愿见到你喽！","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374048/158baa38d21a8510d5b2a98150a4de9f.jpg","position":5,"width":1067,"height":1600},{"id":374049,"caption":"白云永远眷恋着雪山","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374049/8ce373d8d9a997839bf64a5cd66d4186.jpg","position":6,"width":1600,"height":1067},{"id":374050,"caption":"看着雪山发呆，其实就是我想要的旅行感觉哦～","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374050/5687738e234409c4706e236a466af252.jpg","position":7,"width":1600,"height":1068},{"id":374051,"caption":"","photo_url":"http://inspiration.chanyouji.cn/UserActivityContent/374051/92a547455fbd1d5a6f47d066d3e8cec1.jpg","position":8,"width":1600,"height":1068}]
     * districts : [{"id":100050,"name":"瑞士","name_en":"Switzerland","name_pinyin":"rui shi|rs","score":null,"level":2,"path":".120002.100050.","published":false,"is_in_china":false,"user_activities_count":51,"lat":46.8182,"lng":8.22751,"is_valid_destination":true,"destination_id":133},{"id":45095,"name":"瓦莱州","name_en":"Valais","name_pinyin":"wa lai zhou|wlz","score":null,"level":4,"path":".120002.100050.22620.45095.","published":false,"is_in_china":false,"user_activities_count":5,"lat":46.5,"lng":8.0333,"is_valid_destination":false,"destination_id":null}]
     * categories : []
     * user : {"id":15931,"name":"黛草青青","gender":0,"level":4,"photo_url":"http://inspiration.chanyouji.cn/User/15931/30a399da33698d2f9f40e96e0a63c991.jpg"}
     * poi : null
     * inspiration_activity_id : 0
     * inspiration_activity : null
     */

    private ActivityBean activity;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public ActivityBean getActivity() {
        return activity;
    }

    public void setActivity(ActivityBean activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "TripEntity{" +
                "user=" + user +
                ", activity=" + activity +
                '}';
    }

    @Override
    public int getType() {
        return 0;
    }

    public static class UserBean {
        private int id;
        private String name;
        private int gender;
        private int level;

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

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        @Override
        public String toString() {
            return "UserBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender=" + gender +
                    ", level=" + level +
                    '}';
        }
    }

    public static class ActivityBean {
        private int id;
        private int likes_count;
        private int comments_count;
        private String topic;
        private int contents_count;
        private int district_id;
        private int favorites_count;
        private String description;
        /**
         * id : 15931
         * name : 黛草青青
         * gender : 0
         * level : 4
         * photo_url : http://inspiration.chanyouji.cn/User/15931/30a399da33698d2f9f40e96e0a63c991.jpg
         */
        private UserBean user;
        /**
         * id : 374043
         * caption :
         * photo_url : http://inspiration.chanyouji.cn/UserActivityContent/374043/9fdb8e28ffc600ff25361770fb9e6e37.jpg
         * position : 0
         * width : 1600
         * height : 1068
         */

        private List<ContentsBean> contents;
        /**
         * id : 100050
         * name : 瑞士
         * name_en : Switzerland
         * name_pinyin : rui shi|rs
         * score : null
         * level : 2
         * path : .120002.100050.
         * published : false
         * is_in_china : false
         * user_activities_count : 51
         * lat : 46.8182
         * lng : 8.22751
         * is_valid_destination : true
         * destination_id : 133
         */

        private List<DistrictsBean> districts;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLikes_count() {
            return likes_count;
        }

        public void setLikes_count(int likes_count) {
            this.likes_count = likes_count;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public int getContents_count() {
            return contents_count;
        }

        public void setContents_count(int contents_count) {
            this.contents_count = contents_count;
        }

        public int getDistrict_id() {
            return district_id;
        }

        public void setDistrict_id(int district_id) {
            this.district_id = district_id;
        }

        public int getFavorites_count() {
            return favorites_count;
        }

        public void setFavorites_count(int favorites_count) {
            this.favorites_count = favorites_count;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<ContentsBean> getContents() {
            return contents;
        }

        public void setContents(List<ContentsBean> contents) {
            this.contents = contents;
        }

        public List<DistrictsBean> getDistricts() {
            return districts;
        }

        public void setDistricts(List<DistrictsBean> districts) {
            this.districts = districts;
        }

        @Override
        public String toString() {
            return "ActivityBean{" +
                    "id=" + id +
                    ", likes_count=" + likes_count +
                    ", comments_count=" + comments_count +
                    ", topic='" + topic + '\'' +
                    ", contents_count=" + contents_count +
                    ", district_id=" + district_id +
                    ", favorites_count=" + favorites_count +
                    ", description='" + description + '\'' +
                    ", user=" + user +
                    ", contents=" + contents +
                    ", districts=" + districts +
                    '}';
        }

        public static class UserBean {
            private int id;
            private String name;
            private int gender;
            private int level;
            private String photo_url;

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

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getPhoto_url() {
                return photo_url;
            }

            public void setPhoto_url(String photo_url) {
                this.photo_url = photo_url;
            }

            @Override
            public String toString() {
                return "UserBean{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", gender=" + gender +
                        ", level=" + level +
                        ", photo_url='" + photo_url + '\'' +
                        '}';
            }
        }

        public static class ContentsBean{
            private int id;
            private String photo_url;
            private int position;
            private String caption;
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

            public String getCaption() {
                return caption;
            }

            public void setCaption(String caption) {
                this.caption = caption;
            }

            @Override
            public String toString() {
                return "ContentsBean{" +
                        "id=" + id +
                        ", photo_url='" + photo_url + '\'' +
                        ", position=" + position +
                        ", caption='" + caption + '\'' +
                        '}';
            }

        }

        public static class DistrictsBean {
            private int id;
            private String name;

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

            @Override
            public String toString() {
                return "DistrictsBean{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
    }
}
