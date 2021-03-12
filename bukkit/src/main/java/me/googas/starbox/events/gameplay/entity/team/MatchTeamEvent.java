package me.googas.starbox.events.gameplay.entity.team;

import lombok.Getter;
import lombok.NonNull;
import me.googas.starbox.events.StarboxEvent;
import me.googas.starbox.gameplay.entity.player.MatchTeam;

/** This event is called or extended when a Team is involved */
public class MatchTeamEvent extends StarboxEvent {

  @NonNull @Getter private final MatchTeam team;

  /**
   * Create the event
   *
   * @param team the team involved in the event
   */
  public MatchTeamEvent(@NonNull MatchTeam team) {
    this.team = team;
  }
}
