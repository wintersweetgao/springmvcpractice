import com.spittr.config.ScanConfig;
import com.spittr.controller.SpittleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * @author dongmei.gao
 * @date 2019/5/27 15:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={ "classpath:spring-bean.xml"})
@ContextConfiguration(classes = ScanConfig.class)
public class SpittleControllerTest {

    @Autowired
    SpittleController spittleController ;

    //请求无参数
    @Test
    public void testSpittlePageNoPara() throws Exception{

        MockMvc mockMvc = standaloneSetup(spittleController).build() ;
        mockMvc.perform(get("/spi/nopara")).andExpect(view().name("spittle"));
        mockMvc.perform(get("/spi/nopara")).andExpect(model().attributeExists("spittleList"));
    }

    //请求有参数
    @Test
    public void testSpittlePagePara() throws Exception{

        MockMvc mockMvc = standaloneSetup(spittleController).build() ;
        mockMvc.perform(get("/spi/para?max=5&count=6")).andExpect(view().name("spittle"));
        mockMvc.perform(get("/spi/para?max=5&count=6")).andExpect(model().attributeExists("spittleList"));
    }

    //路径请求传递参数
    @Test
    public void testSpittlesPath() throws Exception{

        MockMvc mockMvc = standaloneSetup(spittleController).build() ;
        mockMvc.perform(get("/spi/para_path/5/6")).andExpect(view().name("spittle"));
        mockMvc.perform(get("/spi/para_path/5/6")).andExpect(model().attributeExists("spittleList"));
    }

}
