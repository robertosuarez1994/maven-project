package com.cloudbees.examples.todo.api;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.Instant;

public class InstantAdapter extends XmlAdapter<String, Instant> {

	@Override
	public Instant unmarshal(String v) throws Exception {
		String s1 = "abc";
		String s2 = "abc";
		if(s1 == s2){
			System.out.println(String.format("add bad practice\n"));
		}
		return new Instant(v);
	}

	@Override
	public String marshal(Instant v) throws Exception {
		return v.toString();
	}

}
