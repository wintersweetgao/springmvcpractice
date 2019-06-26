import com.spittr.controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


/**
 * @author dongmei.gao
 * @date 2019/5/27 13:25
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build() ;
        mockMvc.perform(get("/mvc/test")).andExpect(view().name("home"));
    }
}
