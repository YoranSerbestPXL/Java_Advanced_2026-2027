package be.pxl.festival.model;

import org.jspecify.annotations.NonNull;

import java.time.LocalTime;

/**
 * Eén optreden op het festival.
 */
public class Act {

    private Long id;
    @NotBlank
    private String name;
    @NonNull
    private Genre genre;
    @NonNull
    private Stage stage;
    @NonNull
    private FestivalDay day;
    @NonNull
    private LocalTime startTime;
    @Min(value = 15, message = "Duur moet minstens 15 minuten zijn")
    @Max(value = 180, message = "Duur mag maximaal 180 minuten zijn")
    private int durationMinutes;
    @Min(value = 0, message = "Fee mag niet negatief zijn")
    private double fee;          // gage in euro
    private boolean headliner;

    public Act() {
    }

    public Act(String name, Genre genre, Stage stage, FestivalDay day,
               LocalTime startTime, int durationMinutes, double fee, boolean headliner) {
        this.name = name;
        this.genre = genre;
        this.stage = stage;
        this.day = day;
        this.startTime = startTime;
        this.durationMinutes = durationMinutes;
        this.fee = fee;
        this.headliner = headliner;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Genre getGenre() { return genre; }
    public void setGenre(Genre genre) { this.genre = genre; }

    public Stage getStage() { return stage; }
    public void setStage(Stage stage) { this.stage = stage; }

    public FestivalDay getDay() { return day; }
    public void setDay(FestivalDay day) { this.day = day; }

    public LocalTime getStartTime() { return startTime; }
    public void setStartTime(LocalTime startTime) { this.startTime = startTime; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }

    public boolean isHeadliner() { return headliner; }
    public void setHeadliner(boolean headliner) { this.headliner = headliner; }
}
