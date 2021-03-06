package entities;

import java.time.LocalDate;

/**
 * Created by Ari on 7/21/16.
 */
public class Appointment {
    public static enum AptType { GROOM, CHECKUP, SURGERY };

    private Long appointmentId;
    private LocalDate aptDate;
    private AptType aptType;
    private Long ownerId;
    private Long petId;

    public Appointment (){

    }
    public Appointment (Long appointmentId, LocalDate aptDate, AptType aptType, Long ownerId, Long petId){

    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDate getAptDate() {
        return aptDate;
    }

    public void setAptDate(LocalDate aptDate) {
        this.aptDate = aptDate;
    }

    public AptType getAptType() {
        return aptType;
    }

    public void setAptType(AptType aptType) {
        this.aptType = aptType;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }
}
