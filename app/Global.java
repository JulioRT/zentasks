import models.*;
import play.*;
import play.libs.*;

import java.util.*;

import com.avaje.ebean.Ebean;

public class Global extends GlobalSettings {

	@Override
	public void onStart(Application app) {
		// Check if the database is empty
		if (User.find.findRowCount() == 0) {
			Ebean.save((List) Yaml.load("initial-data.yml"));
		}
	}

}
