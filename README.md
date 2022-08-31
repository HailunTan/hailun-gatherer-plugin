<DELETE THIS LINE AFTER REVIEW: Metadata block - delete the things below that are not applicable>
---
description: Hailun gatherer Plugin
keywords: (optional) pipe-separated list of any additional keywords
content-type: Documentation|Extension
hc-audience: Content editor|Site builder|Developer|Administrator
marketplace-type: Plugin
marketplace-subtype: Custom gatherer|Filter|Indexing|Search lifecycle|Faceted navigation custom sort|Search servlet filter
marketplace-version: 1.0.0
plugin-scope: Data source|Results page
plugin-package: com.example.plugin.hailungathererplugin
plugin-id: hailun-gatherer-plugin
plugin-interface: gatherer|filtering|jsoup-filtering|indexing|facets|searchServletFilterHook|searchLifeCycle
product-topic: Analytics and reporting|Search data sources|Search packages|Search results pages|Search indexing|Integration and development|Search ranking and sorting|Application administration|System administration
<DELETE THIS BLOCK AFTER REVIEW: Combine the chosen keywords below into a single product-subtopic: line formatted the same way as the product-topic line above. subtopics below are grouped by the topic to make it easier to apply the appropriate sub topics>
* (Analytics and reporting) Search usage analytics|Accessibility reporting|Content reporting|Search trends|Data reporting
* (Search data sources) Custom|Database|File system|Web|Delimited text (CSV/TSV)|JSON|Directory (LDAP/AD)|Squiz Connect|Squiz Matrix|Social media|XML
* (search results pages) Search results and templates|Query language|Data model manipulation|Auto-completion|Cached results|Curator|Event search|Geospatial search|Localization|Search sessions and history|Best bets|Contextual navigation|Extra searches|Faceted navigation|Personalization|Search data model|DLS (Document Level Security)
* (Search indexing) Document filters|Workflow scripts|Metadata|Index manipulation|Push indexes|Spelling suggestions|Knowledge graph
* (Integration and development) APIs|Plugins|Performance
* (Search ranking and sorting) Padre|Query optimization|Stemming|Synonyms|Query independent evidence|SEO and tuning|Query blending|Result ranking and sorting|Result collapsing|Result diversification
* (Application administration) User management|Administration dashboard
* (System administration) Installation|Upgrades|System services|Global configuration|Multi-server configuration|Logging|Security|Backup|Monitoring|Patching
---

# Plugin: Hailun gatherer Plugin


<DELETE THIS LINE AFTER REVIEW: Provide a concise description of the purpose of the plugin.>

Hailun gatherer Plugin

<DELETE THIS LINE AFTER REVIEW: e.g. This plugin can be used to transform and modify JSON data before it is indexed.>


<DELETE THIS LINE AFTER REVIEW: e.g. Use this plugin if you need to make changes to JSON data that has been downloaded so that the changes are reflected within the search index.>


Enable the **hailun-gatherer-plugin** plugin on your **<results page|data source>** from the **Extensions** screen in the administration dashboard or add the following <results page|data source> configuration to enable the plugin.

```ini
plugin.hailun-gatherer-plugin.enabled=true
plugin.hailun-gatherer-plugin.version=1.0.0
```

<DELETE THIS LINE AFTER REVIEW: For filter plugins (update as reqd):>

Add <FILTER NAME> to the filter chain:

<DELETE THIS LINE AFTER REVIEW: Update the plugin filter class com.example.plugin.hailungathererplugin.CLASSNAME in the line below>
```ini
filter.classes=<OTHER-FILTERS>:com.example.plugin.hailungathererplugin.CLASSNAME:<OTHER-FILTERS>
```

<DELETE THIS LINE AFTER REVIEW: for jsoup filter plugins (update as reqd):>

Ensure that Jsoup filtering is enabled (`filter.classes` is either not set in the configuration, or includes the value `JSoupProcessingFilterProvider`, then add the <NAME> filter to the jsoup filter chain.

NOTE: The <NAME> filter should be placed at an appropriate position in the filter chain. In most circumstances this should be located towards the end of the filter chain.

<DELETE THIS LINE AFTER REVIEW: Update the plugin filter class com.example.plugin.hailungathererplugin.CLASSNAME in the line below>
```ini
filter.jsoup.classes=<OTHER-JSOUP-FILTERS>,com.example.plugin.hailungathererplugin.CLASSNAME<OTHER-JSOUP-FILTERS>
```

NOTE: The <NAME> filter should be placed at an appropriate position in the jsoup filter chain (which applies the filters from left to right). In most circumstances this should be located towards the end of the jsoup filter chain.

<DELETE THIS LINE AFTER REVIEW: For data source plugins (update if reqd):>
NOTE: The plugin will take effect after a full update of the data source.

<DELETE THIS LINE AFTER REVIEW: For results page plugins (update if reqd):>
NOTE: The plugin will take effect as soon as it is enabled.


The following options can be set in the <results page|data source> configuration to configure the plugin:

* `plugin.hailun-gatherer-plugin.config.foo`: What it does. Default is <the default value>
* `plugin.hailun-gatherer-plugin.config.other-config-setting`: what it does. Default is <the default value>


<DELETE THIS LINE AFTER REVIEW: (optional): Provide additional details about the plugin in appropriate. Include details on data model output, FreeMarker usage etc. >


<DELETE THIS LINE AFTER REVIEW: Provide relevant examples showing how to use the different functionality provided by the plugin. >


This example shows ...


<DELETE THIS LINE AFTER REVIEW: List any relevant related links here>

* [Related docs item link text](/path/to/docs-page-item.md)
* [Related link text](https://link.to/related/page.html)



<DELETE THIS block AFTER REVIEW: Provide guidance on how to upgrade between versions, especially if some breakable changes have been introduced.
Recommended structure:

Instructions how to upgrade from previous to next version of the plugin


Provide log what has changed in each version of the plugin.
Recommended structure (see https://keepachangelog.com/en/1.0.0/):

Itemise your changes under the following headings:
>


* Added ...


* Changed ...


* Deprecated ... (for soon-to-be-removed items)
* Removed ... (for items that are now removed)


* Fixed ...


* 