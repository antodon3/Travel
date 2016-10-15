package com.oy.entity;

import com.oy.adapter.TypeMoreAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/10/1.
 */
public class CityEntity implements TypeMoreAdapter.OnType {

        private String name;
        private String button_text;
        private String region;

        private List<DestinationsBean> destinations;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getButton_text() {
            return button_text;
        }

        public void setButton_text(String button_text) {
            this.button_text = button_text;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public List<DestinationsBean> getDestinations() {
            return destinations;
        }

        public void setDestinations(List<DestinationsBean> destinations) {
            this.destinations = destinations;
        }

    @Override
    public String toString() {
        return "CityEntity{" +
                "name='" + name + '\'' +
                ", button_text='" + button_text + '\'' +
                ", region='" + region + '\'' +
                ", destinations=" + destinations +
                '}';
    }

    @Override
    public int getType() {
        return 0;
    }

    public static class DestinationsBean implements TypeMoreAdapter.OnType {
            private int id;
            private int district_id;
            private String name;
            private String name_en;
            private int level;
            private String photo_url;
            private String tip;
            /**
             * id : 66760
             * width : 1192
             * height : 1067
             * url : http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg
             * file_size : 1088794
             * photo_url : http://inspiration.chanyouji.cn/Destination/109/2b85ab3d7ebda3c321436a6147153f09.jpg
             */

            private PhotoBean photo;

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

            public String getTip() {
                return tip;
            }

            public void setTip(String tip) {
                this.tip = tip;
            }

            public PhotoBean getPhoto() {
                return photo;
            }

            public void setPhoto(PhotoBean photo) {
                this.photo = photo;
            }

        @Override
        public String toString() {
            return "DestinationsBean{" +
                    "id=" + id +
                    ", district_id=" + district_id +
                    ", name='" + name + '\'' +
                    ", name_en='" + name_en + '\'' +
                    ", level=" + level +
                    ", photo_url='" + photo_url + '\'' +
                    ", tip='" + tip + '\'' +
                    ", photo=" + photo +
                    '}';
        }

        @Override
        public int getType() {
            return 0;
        }

        public static class PhotoBean {
                private int id;
                private String photo_url;

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

            @Override
            public String toString() {
                return "PhotoBean{" +
                        "id=" + id +
                        ", photo_url='" + photo_url + '\'' +
                        '}';
            }
        }

        }
    }
