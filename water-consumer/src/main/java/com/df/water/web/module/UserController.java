package com.df.water.web.module;


import com.df.water.constant.UnifyErrorCode;
import com.df.water.constant.UnifyErrorMsg;
import com.df.water.facade.service.UserService;
import com.df.water.utils.Result;
import com.df.water.vo.user.CreateUserVO;
import com.df.water.vo.user.UpdateUserVO;
import com.df.water.web.common.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户基本信息操作, 控制层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@RestController
@Api(tags = {"用户操作接口"})
@RequestMapping(value = "/water/user")
public class UserController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userServiceImpl;

    @ApiOperation(value = "用户登录", notes = "用户登录")
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public Result signIn(@Validated @RequestBody CreateUserVO createUserVO) {
        return new Result();
    }


    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public Result signUp() {
        Long loginUserId = this.getLoginUserId();

        if (null != loginUserId) {
            return Result.create(UnifyErrorMsg.ACCESS_SUCCESS, UnifyErrorCode.ACCESS_SUCCESS);
        }

        return Result.create(UnifyErrorMsg.ACCESS_FAILURE, UnifyErrorCode.ACCESS_FAILURE);
    }




    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(@Validated @RequestBody UpdateUserVO updateUserVO) {
        return new Result();
    }






    @ApiOperation(value = "删除用户", notes = "删除用户")
    @ApiImplicitParam(paramType = "path", name = "id", value = "用户id", required = true, dataType = "long")
    @RequestMapping(value = "/deleteByUserId/{id}", method = RequestMethod.DELETE)
    public Result deleteByUserId(@PathVariable(name = "id") Long id) {
        Map<String, Object> returnMap = new HashMap<>();

        try {
            userServiceImpl.deleteByUserId(id);
            returnMap.put("name", "limiaofei");
        } catch (Exception e) {
            logger.error("删除用户信息失败, e = {}", e.getMessage());
            return Result.create(UnifyErrorMsg.ACCESS_FAILURE, UnifyErrorCode.ACCESS_FAILURE, returnMap);
        }

        return Result.create(UnifyErrorMsg.ACCESS_SUCCESS, UnifyErrorCode.ACCESS_SUCCESS, returnMap);
    }

    @ApiOperation(value = "当前帐号绑定的手机号", notes = "获取当前帐号绑定的手机号")
    @RequestMapping(value = "/getPhoneByUserId", method = RequestMethod.GET)
    public Result getPhoneByUserId() {
        Long jolanUserId = this.getLoginUserId();

        if (null != jolanUserId) {
            String phone = null;
            try {
                phone = userServiceImpl.getPhoneByUserId(jolanUserId);
            } catch (Exception e) {
                logger.error("获取用户绑定手机号失败, e = {}", e.getMessage());
            }
        }

        return null;

    }


    @ApiOperation(value = "修改手机号", notes = "修改手机号")
    @ApiImplicitParam(paramType = "path", name = "", value = "", required = true, dataType = "")
    @RequestMapping(value = "/modifyBindingPhone/{phone}", method = RequestMethod.GET)
    public Result modifyBindingPhone(@PathVariable(value = "phone") String phone) {

        try {

        } catch (Exception e) {
            logger.error("查询用户绑定手机号失败, e = {}", e.getMessage());
            return Result.create(UnifyErrorMsg.ACCESS_FAILURE, UnifyErrorCode.ACCESS_FAILURE, false);
        }

        return null;
    }


}
