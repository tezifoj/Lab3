package interfaces;

import enums.Emotion;
import enums.RecordType;

public interface PresentWithReproach {
    void presentWithReproach(Emotion emotion, RecordType book);

    void present();

    default String getReproachText() {
        return "присутствующих";
    }
}
