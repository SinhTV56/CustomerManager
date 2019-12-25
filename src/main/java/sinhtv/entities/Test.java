
package sinhtv.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Test {
    @Id
        @GeneratedValue
    private String test_id;
    private int active;
    private String description;
    private String password;
    private int question_number;
    private String test_name;
    private int testtime;
    private String test_type_id;
    @ManyToOne
    @JoinColumn(name = "test_type_id")
    private Test_type test_type;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Question question;
    
    
    public Test() {
    }

    public Test(String test_id, int active, String description, String password, int question_number, String test_name, int testtime, String test_type_id) {
        this.test_id = test_id;
        this.active = active;
        this.description = description;
        this.password = password;
        this.question_number = question_number;
        this.test_name = test_name;
        this.testtime = testtime;
        this.test_type_id = test_type_id;
    }

    public String getTest_id() {
        return test_id;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQuestion_number() {
        return question_number;
    }

    public void setQuestion_number(int question_number) {
        this.question_number = question_number;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public int getTesttime() {
        return testtime;
    }

    public void setTesttime(int testtime) {
        this.testtime = testtime;
    }

    public String getTest_type_id() {
        return test_type_id;
    }

    public void setTest_type_id(String test_type_id) {
        this.test_type_id = test_type_id;
    }
    
}
