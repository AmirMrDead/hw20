package hospital.entity.prescription_drug;

import hospital.entity.drug.Drug;
import hospital.entity.prescription.Prescription;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class PrescriptionDrug{

    @EmbeddedId
    private PrescriptionDrugId prescriptionDrugId = new PrescriptionDrugId();
    @ManyToOne
    @MapsId("prescriptionId")
    private Prescription prescription;
    @ManyToOne
    @MapsId("drugId")
    private Drug drug;

}
