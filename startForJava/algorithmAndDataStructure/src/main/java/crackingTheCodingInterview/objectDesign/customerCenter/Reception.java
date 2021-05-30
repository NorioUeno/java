package crackingTheCodingInterview.objectDesign.customerCenter;

import java.util.ArrayList;
import java.util.List;

public class Reception {


  public Res dispatchCall(Call call) throws Exception {

    List<Respondent> respondents = new ArrayList<Respondent>();
    List<Manager> managers = new ArrayList<Manager>();
    List<Director> directors = new ArrayList<Director>();

    respondents.add(new Respondent("ueno"));
    respondents.add(new Respondent("yamada"));
    respondents.add(new Respondent("yukawa"));

    managers .add(new Manager("kaneko"));
    managers .add(new Manager("hosoya"));

    directors.add(new Director("yaginuma"));


    for (Respondent r : respondents) {
      if(!r.isBusy) {
        return r.reciveCall(call);
      }
    }

    for (Manager m : managers) {
      if(!m.isBusy) {
        return m.reciveCall(call);
      }
    }

    for (Director d : directors ) {
      if(!d.isBusy) {
        return d.reciveCall(call);
      }
    }

    return null;

  }

}
