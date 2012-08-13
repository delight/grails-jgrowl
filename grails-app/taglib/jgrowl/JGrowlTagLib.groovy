package jgrowl

class JGrowlTagLib {

	static namespace = "jg"

	def jgrowl = { attrs ->
		def dev = grails.util.GrailsUtil.isDevelopmentEnv()
		def jgrowlJSFile = "jquery.jgrowl${dev?'':'_google'}.js"
		out << """<link href="${g.resource(plugin:'jgrowl', dir:'css', file:'jquery.jgrowl.css')}" media="screen" rel="stylesheet" type="text/css" />"""
		out << """<script src="${g.resource(plugin:'jgrowl', dir:'js', file:jgrowlJSFile)}" type="text/javascript"></script>"""
	}
}
