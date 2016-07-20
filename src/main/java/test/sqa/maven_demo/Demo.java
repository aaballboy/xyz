package test.sqa.maven_demo;

import org.apache.commons.lang3.StringUtils;

public class Demo {
    public String getDiff(String s1, String s2){
    	if(!StringUtils.isEmpty(s1) &&  !StringUtils.isEmpty(s2)){
    		return StringUtils.difference(s1, s2);
    	}
    	return null;
    }
}
