package com.example.yaml;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.yamlparser.YamlParser;

@SpringBootApplication
public class YamlApplication {

	public static void main(String[] args) {
		SpringApplication.run(YamlApplication.class, args);
		YamlParser yamlParser = new YamlParser();
		String file="student.yml";
		Map<String,Object> student = yamlParser.convertFromYaml(file);
		System.out.print(student.get("id"));
	}

}
