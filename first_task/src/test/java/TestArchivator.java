import com.example.first_task.first_task.Archivator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArchivator {
    @Test
    public void testDoArchiveStr() {
        Archivator archivator = new Archivator();
        Assertions.assertEquals("3A2BcC4sS2A",archivator.doArchiveStr("AAABBcCssssSAA"));
        Assertions.assertEquals("A",archivator.doArchiveStr("A"));
        Assertions.assertEquals("3D",archivator.doArchiveStr("DDD"));
        Assertions.assertEquals("2A3D2d",archivator.doArchiveStr("AADDDdd"));
        Assertions.assertEquals("недопустимое значение: Строка содержит цифры или пробел",archivator.doArchiveStr("214141SS"));
        Assertions.assertEquals("недопустимое значение: Строка содержит цифры или пробел",archivator.doArchiveStr(" "));
        Assertions.assertEquals("Недопустимое значение: Введенная строка пустая",archivator.doArchiveStr(""));

    }
}
