import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rashid on 8/29/16.
 */
public class SolutionTest {

    @Test
    public void test(){
        Solution solution = new Solution();

        int result = solution.solution(500);

        Assert.assertThat(result, CoreMatchers.is(12));
    }
}
