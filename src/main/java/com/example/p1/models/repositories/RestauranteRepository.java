package com.example.p1.models.repositories;

import com.example.p1.models.*;
import com.example.p1.models.views.RestauranteView;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RestauranteRepository extends CrudRepository<Restaurante, Integer>{
        String resQuery1 = "SELECT res_name RestaurantName " +
                            "FROM restaurantes, ementas, pratos, alimentos, pratoalimento, intols " +
                            "WHERE eme_res_id = res_id AND eme_pra_id = pra_id AND pa_pra_id = pra_id AND pa_ali_id = ali_id AND intol_ali_id = intol_id ";
                            
                            @Query(value=resQuery1 + "AND intol_id<>:id", nativeQuery=true)
                            Iterable<RestauranteView>getResNoAli1(@Param ("id") int id);        
                            
    }

