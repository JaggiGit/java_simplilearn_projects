package com.simplilearn.service;

import com.simplilearn.dao.Userdao;
import com.simplilearn.dao.Userdaoimpl;
import com.simplilearn.dto.User;

public class Userserviceimpl implements Userservice
{         
	    private Userdao dao ;
           public    Userserviceimpl()
               {
            	   dao = new Userdaoimpl(); 
               }
	@Override
	public boolean Validateuser(User user) {
		
		return dao.Validateuser(user);
	}

}
