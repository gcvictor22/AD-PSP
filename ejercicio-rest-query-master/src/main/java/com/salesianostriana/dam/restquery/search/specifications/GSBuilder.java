package com.salesianostriana.dam.restquery.search.specifications;

import com.salesianostriana.dam.restquery.search.util.QueryableEntity;
import com.salesianostriana.dam.restquery.search.util.SearchCriteria;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.stream.Collectors;

@Log
@AllArgsConstructor
public class GSBuilder<T> {

    private List<SearchCriteria> params;
    private Class type;

    public Specification<T> build(){
        List<SearchCriteria> checkedParams = params.stream()
                .filter(p -> QueryableEntity.checkQueryParams(type, p.getKey())).toList();

        if (checkedParams.isEmpty())
            return null;

        Specification<T> res = new GenericSpecification<T>(params.get(0));

        for (SearchCriteria param : params) {
            res = res.and(new GenericSpecification<T>(param));
        }

        return res;
    }

}
