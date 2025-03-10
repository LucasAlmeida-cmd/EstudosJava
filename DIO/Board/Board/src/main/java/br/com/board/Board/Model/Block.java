package br.com.board.Board.Model;

import jakarta.persistence.*;


import java.util.Calendar;

@Entity
@Table(name = "BLOCKS_COLUMN")
public class Block {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    @Temporal(value=TemporalType.DATE)
    private Calendar blockedAt;
    private String blockReason;
    @Temporal(value=TemporalType.DATE)
    private Calendar unblockedAt;
    private String unblockReason;

}
