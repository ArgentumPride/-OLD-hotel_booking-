package ua.pride.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ROOM")
@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long room_id;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Column
    private double price;

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
