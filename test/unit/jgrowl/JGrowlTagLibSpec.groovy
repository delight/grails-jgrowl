/**
 * 
 */
package jgrowl

import grails.test.mixin.*
import grails.plugin.spock.UnitSpec

class JGrowlTagLibSpec extends UnitSpec {
	
	def "test <jg:jgrowl />" () {
		when:
		def output = applyTemplate('<jg:jgrowl />')
		
		then:
		output == """<link href="null/css/jquery.jgrowl.css" media="screen" rel="stylesheet" type="text/css" /><script src="null/js/jquery.jgrowl.js" type="text/javascript"></script>"""
	}

}
