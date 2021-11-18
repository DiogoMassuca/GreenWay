package com.example.p1.models.repositories;

import com.example.p1.models.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RestauranteRepository extends CrudRepository<Restaurante, Integer>{
        String resQuery1 = "SELECT res_name" +
                            "FROM restaurantes, ementas, pratos, alimentos, pratoalimento" +
                            "WHERE eme_res_id = res_id AND eme_pra_id = pra_id AND pa_pra_id = pra_id AND pa_ali_id = ali_id AND ali_id <> 1";

                            @Query(value=resQuery1, nativeQuery=true)
                            String getResNoAli1();
    }

