package com.lrg.model.character.d20;

import java.util.List;
import java.util.Map;

import com.lrg.model.character.Rules;

/**
 * Default rules for playing generic D20-based games.  Uses 6-attribute characters, skills have no max/min, etc.  Like other rules sets, much of the character comes from its class(es).
 * @author wphillips
 *
 */
public class DefaultD20Rules extends Rules
{
    private Map<CharacterClass, List<Skill>> classSkills;

}
