package com.syn.tfs.Repository;

import org.apache.log4j.Logger;

import com.syn.tfs.stepdef.Test;

public class LoggerRepo {
	static Logger log = Logger.getLogger(Test.class);
	
	public static void setLogger(String className)
	{
		log = Logger.getLogger(className+".class");
	}
	public static Logger getLogger()
	{
		return log;
	}
}