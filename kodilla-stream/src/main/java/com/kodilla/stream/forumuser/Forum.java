package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theFormUser = new ArrayList<>();

    public Forum(){
        theFormUser.add(new ForumUser(1,"użytkownik1", 'M', 1999,12,3,1));
        theFormUser.add(new ForumUser(2,"użytkownik2", 'F', 1999,12,3,3));
        theFormUser.add(new ForumUser(3,"użytkownik3", 'F', 1999,12,3,13));
        theFormUser.add(new ForumUser(4,"użytkownik4", 'M', 1999,12,3,0));
        theFormUser.add(new ForumUser(5,"użytkownik5", 'M', 1999,12,3,13));
        theFormUser.add(new ForumUser(6,"użytkownik6", 'F', 1999,12,3,13));
        theFormUser.add(new ForumUser(7,"użytkownik7", 'M', 2004,12,3,13));
        theFormUser.add(new ForumUser(8,"użytkownik8", 'F', 1999,12,3,13));
        theFormUser.add(new ForumUser(9,"użytkownik9", 'M', 2003,12,3,13));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theFormUser);
    }

}
