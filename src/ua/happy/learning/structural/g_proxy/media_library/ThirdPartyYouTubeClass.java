package ua.happy.learning.structural.g_proxy.media_library;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> populateVideos() {
        return null;
    }

    @Override
    public Video getVideo(String videoId) {
        return null;
    }
}
