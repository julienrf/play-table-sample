import models.Lesson;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class SetupData extends Job {

    @Override
    public void doJob() {
        if (Lesson.count() == 0) {
            Fixtures.load("initial-data.yml");
        }
    }
}
