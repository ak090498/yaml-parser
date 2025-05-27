package com.example.yamlparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class YamlParser  
{
public Map<String,Object> convertFromYaml(String file)
{
	Map<String, Object> data=null;
  try {

	InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
	Yaml yaml = new Yaml();
	data = yaml.load(inputStream);
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
   return data;

}
}


