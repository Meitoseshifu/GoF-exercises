package ua.happy.learning.structural.g_proxy.proxy;

import ua.happy.learning.structural.g_proxy.media_library.ThirdPartyYouTubeLib;
import ua.happy.learning.structural.g_proxy.media_library.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> populateVideos() {
        return null;
    }

    @Override
    public Video getVideo(String videoId) {
        return null;
    }
}
