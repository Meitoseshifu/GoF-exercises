package ua.happy.learning.structural.g_proxy.media_library;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> populateVideos();

    Video getVideo(String videoId);
}
