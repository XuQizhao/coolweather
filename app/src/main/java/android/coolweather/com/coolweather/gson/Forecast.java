package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asdf on 2017/11/28.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperture temperture;


    public class More{
        @SerializedName("txt_d")
        public String info;
    }


    public class Temperture{
        public String Max;
        public String min;
    }
}
