package demo.controller;
/*
 * Copyright qq:1219331697
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.UserService;

/**
 * @author qq:1219331697
 *
 */
@RestController
public class IndexController {

	@RequestMapping("/")
	@ResponseBody
	String index() {
		return "index! Hello World!";
	}

	@RequestMapping("/home")
	@ResponseBody
	String home() {
		return "home! Hello World!";
	}

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return userService.add(10, 20);
    }

}
