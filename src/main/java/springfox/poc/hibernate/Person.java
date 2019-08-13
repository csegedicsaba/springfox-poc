package springfox.poc.hibernate;

import javax.persistence.*;


@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    private Long personId;

    @ManyToOne
    @JoinColumn(name = "CITY_ID")
    private City city;


    public Long getPersonId() {
        return this.personId;
    }

    public void setPersonId(Long zarolasId) {
        this.personId = zarolasId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
