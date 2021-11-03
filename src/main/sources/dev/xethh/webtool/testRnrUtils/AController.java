package dev.xethh.webtool.testRnrUtils;

import dev.xethh.webtool.dto.base.request.PaginatedRequest;
import dev.xethh.webtool.dto.base.request.Request;
import dev.xethh.webtool.dto.base.response.ItemResponse;
import dev.xethh.webtool.dto.base.response.ListResponse;
import dev.xethh.webtool.dto.base.response.SuccessResponse;
import dev.xethh.webtool.utils.Sorting;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Optional;

@Component
@RequestMapping(value = "/api/v1/a")
public class AController {
    public static class MethodA extends Request{ }
    public static class MethodAResponse {
        public MethodAResponse(String fieldA, Integer fieldB) {
            this.fieldA = fieldA;
            this.fieldB = fieldB;
        }

        private String fieldA;
        private Integer fieldB;

        public String getFieldA() {
            return fieldA;
        }

        public void setFieldA(String fieldA) {
            this.fieldA = fieldA;
        }

        public Integer getFieldB() {
            return fieldB;
        }

        public void setFieldB(Integer fieldB) {
            this.fieldB = fieldB;
        }
    }


    @ResponseBody
    @RequestMapping(value = "/methodA")
    public ItemResponse<MethodAResponse> methodA(MethodA request){
        return SuccessResponse.item(new MethodAResponse("a",2));
    }

    @ResponseBody
    @RequestMapping(value = "/methodB")
    public ListResponse methodB(MethodA request){
        return SuccessResponse.list(Arrays.asList(new MethodAResponse("a",2)));
    }

    @ResponseBody
    @RequestMapping(value = "/methodC")
    public SuccessResponse methodC(MethodA request){
        return SuccessResponse.noPayload();
    }

    public static class MethodD extends Request{
        private String x;

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/methodD")
    public ItemResponse<MethodD> methodD(MethodD request){
        return SuccessResponse.item(request);
    }

    public static class MethodE extends PaginatedRequest {
        private String x;

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/methodE")
    public ItemResponse<Optional<Sorting>> methodE(MethodE request){
        return SuccessResponse.item(request.asSortingOpt());
    }
}
