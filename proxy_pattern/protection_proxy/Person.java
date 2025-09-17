package proxy_pattern.protection_proxy;

public interface Person {
    String getName();
    String getGender();
    String getInterest();
    int getGeekRating();

    void setName(String name);
    void setGender(String gender);
    void setInterest(String interest);
    void setGeekRating(int rating);
    
}
