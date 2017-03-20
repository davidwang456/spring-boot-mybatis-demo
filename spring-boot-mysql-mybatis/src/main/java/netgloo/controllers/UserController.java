package netgloo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import netgloo.domain.City;
import netgloo.mapper.CityMapper;

@Controller
@RequestMapping(value="/city")
public class UserController {

  @Autowired
  private CityMapper cityMapper;
 
@RequestMapping(value="/get")
  @ResponseBody
  public String getByEmail(String state) {
    String userIngfo;
    try {
      City user = cityMapper.findByState(state);
      userIngfo = String.valueOf(user.toString());
    }
    catch(Exception ex) {
      return "User not found";
    }
    return "The userIngfo is: " + userIngfo;
  }

} // class UserController
