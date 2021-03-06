package com.lyl.pojo.vo;

public class PublisherVideo {
    private UsersVo usersVo;

    private boolean userLikeVideo;

    public UsersVo getUsersVo() {
        return usersVo;
    }

    public void setUsersVo(UsersVo usersVo) {
        this.usersVo = usersVo;
    }

    public boolean isUserLikeVideo() {
        return userLikeVideo;
    }

    public void setUserLikeVideo(boolean userLikeVideo) {
        this.userLikeVideo = userLikeVideo;
    }

    @Override
    public String toString() {
        return "PublisherVideo{" +
                "usersVo=" + usersVo +
                ", userLikeVideo=" + userLikeVideo +
                '}';
    }
}
