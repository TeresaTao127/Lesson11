package lesson11Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoctorSpecialties {
    public static void main(String[] args) {
        List<String> specializations= Arrays.asList("Hospital:Surgeon:Radiologist:Maxillofacial Surgeon:Pediatrician",
                "Clinic:Pediatrician", "Clinic:Internist:Laryngologist:Pediatrician");

        List<String>preparedSpecs=specializations.stream()
                .map(specialization -> specialization.split(":"))
                .flatMap(array ->Arrays.stream(array))
                .filter(specialization -> !specialization.startsWith("Hospital") && !specialization.startsWith("Clinic"))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(String.join(",",preparedSpecs));

    }
}

