jGrowl for Grails - jGrowl is a jQuery plugin that raises unobtrusive messages within the browser, similar to the way that OS X's Growl Framework works.
===

The Plugin provides the JavaScript library and the accompanying css for jGrowl. jGrowl is a jQuery plugin that raises unobtrusive messages within the browser, similar to the way that OS X's Growl Framework works.
It offers the un-compressed version of the JavaScript-Library in the Development-Stage and the compressed elseways.
It integrates nicely with the resources plugin.

What is it?
---
jGrowl is a JavaScript library that that raises unobtrusive messages within the browser, similar to the way that OS X's Growl Framework works.
jGrowl is based on jQuery.

To get started -- checkout http://stanlemon.net/pages/jgrowl

Installation:
---
grails install-plugin jgrowl

Usage:
---
If you want to use it with the resources plugin http://grails.org/plugin/resources you can use the resources TagLib to include the jgrowl module in your gsp.

	<r:require module="jgrowl" />

For developers that don't use the resources plugin the jgrowl plugin also provides a TagLib that conviniently adds the jgrowl js library  and css to your gsp. It
offers the same feature set regarding compressed in non-dev-stage vs. un-compressed in dev-stage.

	<jg:jgrowl />

Versioning:
---
Plugin version convetion is 

	<javascript-libraryversion>.<plugin-minor-for-fixes>

Copyright and License
---

jgrowl plugin:

Copyright © 2012 Konstantinos Kostarellis

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

jGrowl JavaScript Library and CSS:

jGrowl is free and open source, it's distributed under the MIT and GPL licenses - which means you can pretty much do whatever you want with it.

http://stanlemon.net/pages/jgrowl