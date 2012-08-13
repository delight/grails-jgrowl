// Resource declarations for Resources plugin
def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def jgrowlJSFile = "jquery.jgrowl${dev?'':'_google'}.js"

modules = {
	'jgrowl-css' {
		resource url:[plugin: 'jgrowl', dir: 'css', file: 'jquery.jgrowl.css'], disposition: 'head'
	}
	
	'jgrowl-js' {
		dependsOn 'jquery'
		resource id:'jgrowl-js', url:[plugin: 'jgrowl', dir:'js', file:jgrowlJSFile], disposition:'defer' // , nominify: !dev
	}
	
	'jgrowl' {
		dependsOn 'jgrowl-css, jgrowl-js'
	}
}