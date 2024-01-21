import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stat.StatsService;

public class StatsServiceTest {

    @Test
    public void ShouldSumSales() {  //Тест на сумму всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 180;
        long actualSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void ShouldAverageSumSales() { // тест на среднюю сумму всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 15;
        long actualSales = service.averageSumSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void ShouldMaxSales() { // тест на получение номера месяца в котором был пик продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 8;
        long actualSales = service.maxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void ShouldMinSales() { // тест на получение номера месяца в котором был минимум продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 9;
        long actualSales = service.minSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }


    @Test
    public void ShouldLessAverageSumSales() { // тест на получение номера месяца в котором продажи были ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 11;
        long actualSales = service.lessAverageSumSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void ShouldOverAverageSumSales() { // тест на получение номера месяца в котором продажи были выше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 12;
        long actualSales = service.overAverageSumSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }
}
