package com.example.plugin.hailungathererplugin;

import com.google.common.collect.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.funnelback.plugin.gatherer.PluginGatherContext;
import com.funnelback.plugin.gatherer.PluginGatherer;
import com.funnelback.plugin.gatherer.PluginStore;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class HailunGathererPluginPluginGatherer implements PluginGatherer {

    private static final Logger log = LogManager.getLogger(HailunGathererPluginPluginGatherer.class);
    
    @Override
    public void gather(PluginGatherContext pluginGatherContext, PluginStore store) throws Exception {
        log.debug("Gathering documents");

        log.warn("Hello-1 (test message): " + pluginGatherContext.getConfigSetting("random"));

        pluginGatherContext.setConfigSetting("random","4444");

        log.warn("Hello-2 (test message): " + pluginGatherContext.getConfigSetting("random"));


        URI uri = new URI("https://hailun.squiz.net/1");
        String content = "Spaghetti";

        ListMultimap<String, String> multimap = ArrayListMultimap.create();
        Map<String, Collection<String>> map = ImmutableMap.of("Content-Type", List.of("text/plain"),
                                                            "title",Arrays.asList("a", "b","c","d"));

        map.forEach(multimap::putAll);

        store.store(uri, content.getBytes(StandardCharsets.UTF_8), multimap);


    }
}
