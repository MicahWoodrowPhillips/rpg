
package com.lrg.d20.character.web.pf;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Skill01",
    "Skill01Ab",
    "Skill01CC",
    "Skill01AbMod",
    "Skill01Rank",
    "Skill01MiscMod",
    "Skill01ACP",
    "Skill01Mod",
    "Skill02",
    "Skill02Ab",
    "Skill02CC",
    "Skill02AbMod",
    "Skill02Rank",
    "Skill02MiscMod",
    "Skill02ACP",
    "Skill02Mod",
    "Skill03",
    "Skill03Ab",
    "Skill03CC",
    "Skill03AbMod",
    "Skill03Rank",
    "Skill03MiscMod",
    "Skill03ACP",
    "Skill03Mod",
    "Skill04",
    "Skill04Ab",
    "Skill04CC",
    "Skill04AbMod",
    "Skill04Rank",
    "Skill04MiscMod",
    "Skill04ACP",
    "Skill04Mod",
    "Skill05",
    "Skill05Ab",
    "Skill05CC",
    "Skill05AbMod",
    "Skill05Rank",
    "Skill05MiscMod",
    "Skill05ACP",
    "Skill05Mod",
    "Skill06",
    "Skill06Ab",
    "Skill06CC",
    "Skill06AbMod",
    "Skill06Rank",
    "Skill06MiscMod",
    "Skill06ACP",
    "Skill06Mod",
    "Skill07",
    "Skill07Ab",
    "Skill07CC",
    "Skill07AbMod",
    "Skill07Rank",
    "Skill07MiscMod",
    "Skill07ACP",
    "Skill07Mod",
    "Skill08",
    "Skill08Ab",
    "Skill08CC",
    "Skill08AbMod",
    "Skill08Rank",
    "Skill08MiscMod",
    "Skill08ACP",
    "Skill08Mod",
    "Skill09",
    "Skill09Ab",
    "Skill09CC",
    "Skill09AbMod",
    "Skill09Rank",
    "Skill09MiscMod",
    "Skill09ACP",
    "Skill09Mod",
    "Skill10",
    "Skill10Ab",
    "Skill10CC",
    "Skill10AbMod",
    "Skill10Rank",
    "Skill10MiscMod",
    "Skill10ACP",
    "Skill10Mod",
    "Skill11",
    "Skill11Ab",
    "Skill11CC",
    "Skill11AbMod",
    "Skill11Rank",
    "Skill11MiscMod",
    "Skill11ACP",
    "Skill11Mod",
    "Skill12",
    "Skill12Ab",
    "Skill12CC",
    "Skill12AbMod",
    "Skill12Rank",
    "Skill12MiscMod",
    "Skill12ACP",
    "Skill12Mod",
    "Skill13",
    "Skill13Ab",
    "Skill13CC",
    "Skill13AbMod",
    "Skill13Rank",
    "Skill13MiscMod",
    "Skill13ACP",
    "Skill13Mod",
    "Skill14",
    "Skill14Ab",
    "Skill14CC",
    "Skill14AbMod",
    "Skill14Rank",
    "Skill14MiscMod",
    "Skill14ACP",
    "Skill14Mod",
    "Skill15",
    "Skill15Ab",
    "Skill15CC",
    "Skill15AbMod",
    "Skill15Rank",
    "Skill15MiscMod",
    "Skill15ACP",
    "Skill15Mod",
    "Skill16",
    "Skill16Ab",
    "Skill16CC",
    "Skill16AbMod",
    "Skill16Rank",
    "Skill16MiscMod",
    "Skill16ACP",
    "Skill16Mod",
    "Skill17",
    "Skill17Ab",
    "Skill17CC",
    "Skill17AbMod",
    "Skill17Rank",
    "Skill17MiscMod",
    "Skill17ACP",
    "Skill17Mod",
    "Skill18",
    "Skill18Ab",
    "Skill18CC",
    "Skill18AbMod",
    "Skill18Rank",
    "Skill18MiscMod",
    "Skill18ACP",
    "Skill18Mod",
    "Skill19",
    "Skill19Ab",
    "Skill19CC",
    "Skill19AbMod",
    "Skill19Rank",
    "Skill19MiscMod",
    "Skill19ACP",
    "Skill19Mod",
    "Skill20",
    "Skill20Ab",
    "Skill20CC",
    "Skill20AbMod",
    "Skill20Rank",
    "Skill20MiscMod",
    "Skill20ACP",
    "Skill20Mod",
    "Skill21",
    "Skill21Ab",
    "Skill21CC",
    "Skill21AbMod",
    "Skill21Rank",
    "Skill21MiscMod",
    "Skill21ACP",
    "Skill21Mod",
    "Skill22",
    "Skill22Ab",
    "Skill22CC",
    "Skill22AbMod",
    "Skill22Rank",
    "Skill22MiscMod",
    "Skill22ACP",
    "Skill22Mod",
    "Skill23",
    "Skill23Ab",
    "Skill23CC",
    "Skill23AbMod",
    "Skill23Rank",
    "Skill23MiscMod",
    "Skill23ACP",
    "Skill23Mod",
    "Skill24",
    "Skill24Ab",
    "Skill24CC",
    "Skill24AbMod",
    "Skill24Rank",
    "Skill24MiscMod",
    "Skill24ACP",
    "Skill24Mod",
    "Skill25",
    "Skill25Ab",
    "Skill25CC",
    "Skill25AbMod",
    "Skill25Rank",
    "Skill25MiscMod",
    "Skill25ACP",
    "Skill25Mod",
    "Skill26",
    "Skill26Ab",
    "Skill26CC",
    "Skill26AbMod",
    "Skill26Rank",
    "Skill26MiscMod",
    "Skill26ACP",
    "Skill26Mod",
    "Skill27",
    "Skill27Ab",
    "Skill27CC",
    "Skill27AbMod",
    "Skill27Rank",
    "Skill27MiscMod",
    "Skill27ACP",
    "Skill27Mod",
    "Skill28",
    "Skill28Ab",
    "Skill28CC",
    "Skill28AbMod",
    "Skill28Rank",
    "Skill28MiscMod",
    "Skill28ACP",
    "Skill28Mod",
    "Skill29",
    "Skill29Ab",
    "Skill29CC",
    "Skill29AbMod",
    "Skill29Rank",
    "Skill29MiscMod",
    "Skill29ACP",
    "Skill29Mod",
    "Skill30",
    "Skill30Ab",
    "Skill30CC",
    "Skill30AbMod",
    "Skill30Rank",
    "Skill30MiscMod",
    "Skill30ACP",
    "Skill30Mod",
    "Skill31",
    "Skill31Ab",
    "Skill31CC",
    "Skill31AbMod",
    "Skill31Rank",
    "Skill31MiscMod",
    "Skill31ACP",
    "Skill31Mod",
    "Skill32",
    "Skill32Ab",
    "Skill32CC",
    "Skill32AbMod",
    "Skill32Rank",
    "Skill32MiscMod",
    "Skill32ACP",
    "Skill32Mod",
    "Skill33",
    "Skill33Ab",
    "Skill33CC",
    "Skill33AbMod",
    "Skill33Rank",
    "Skill33MiscMod",
    "Skill33ACP",
    "Skill33Mod",
    "Skill34",
    "Skill34Ab",
    "Skill34CC",
    "Skill34AbMod",
    "Skill34Rank",
    "Skill34MiscMod",
    "Skill34ACP",
    "Skill34Mod",
    "Skill35",
    "Skill35Ab",
    "Skill35CC",
    "Skill35AbMod",
    "Skill35Rank",
    "Skill35MiscMod",
    "Skill35ACP",
    "Skill35Mod",
    "Name",
    "Player",
    "Alignment",
    "XPCurrent",
    "XPNext",
    "Level",
    "MaxRank",
    "_meta_sheet_data_version",
    "Class",
    "Race",
    "Deity",
    "XPSpeed",
    "Size",
    "LightLoad",
    "MediumLoad",
    "HeavyLoad",
    "LiftOverHead",
    "LiftOffGround",
    "LiftPushDrag",
    "ACSize",
    "ACArmor",
    "ACShield",
    "ACDex",
    "ACDodge",
    "ACNat",
    "ACDeflect",
    "ACMisc",
    "AC",
    "ACTouch",
    "ACFlat",
    "CMBBase",
    "StrMod",
    "CMD",
    "FCMD",
    "MABSize",
    "MABBase",
    "MABStr",
    "MABMisc",
    "MABTemp",
    "MBAB",
    "RABSize",
    "RABBase",
    "RABDex",
    "RABMisc",
    "RABTemp",
    "RBAB",
    "CMBSize",
    "CMBStr",
    "CMBMisc",
    "CMBTemp",
    "CMB",
    "Age",
    "Gender",
    "Height",
    "Weight",
    "Eyes",
    "Hair",
    "Feat1",
    "Feat2",
    "Feat3",
    "Weapon1",
    "Weapon1AB",
    "Str",
    "Dex",
    "DexMod",
    "ReflexAbility",
    "ReflexBase",
    "ReflexMagic",
    "ReflexMisc",
    "ReflexTemp",
    "Reflex",
    "InitDex",
    "InitMisc",
    "Init",
    "Con",
    "ConMod",
    "FortAbility",
    "FortBase",
    "FortMagic",
    "FortMisc",
    "FortTemp",
    "Fort",
    "Int",
    "IntMod",
    "Wis",
    "WisMod",
    "WillAbility",
    "WillBase",
    "WillMagic",
    "WillMisc",
    "WillTemp",
    "Will",
    "Cha",
    "ChaMod",
    "__txt_Notes",
    "__txt_char_contacts",
    "__txt_char_description",
    "__txt_char_personality",
    "total_ranks",
    "Gear01",
    "Feat16",
    "Feat4",
    "SpellsKnown0",
    "SpellsKnown1",
    "Spell01Cast",
    "Spell02Cast",
    "Spell03Cast",
    "Spell04Cast",
    "Spell05Cast",
    "Spell06Cast",
    "Spell01",
    "Spell02",
    "Spell03",
    "Spell04",
    "Spell05",
    "Spell06",
    "Spell08Cast",
    "Spell09Cast",
    "Spell10Cast",
    "Spell11Cast",
    "Spell08",
    "Spell09",
    "Spell10",
    "SpellPerDay0",
    "SpellPerDay1",
    "Spell11",
    "Feat17",
    "Feat18",
    "Featxtra0",
    "Featxtra1",
    "Featxtra2",
    "Featxtra3",
    "Featxtra4",
    "Featxtra5",
    "Feat5",
    "PicURL",
    "Weapon2",
    "Weapon2AB",
    "Weapon2Damage",
    "Weapon1Damage",
    "Weapon1Crit",
    "Weapon1Range",
    "Weapon2Crit",
    "Weapon2Range",
    "ArmorName",
    "ArmorWorn",
    "ArmorType",
    "ArmorBonus",
    "ArmorCheck",
    "ArmorDex",
    "Weapon2Ammo",
    "__txt_private_notes",
    "__txt_char_traits",
    "__txt_text2",
    "__txt_Cash",
    "Speed",
    "Armor",
    "Featxtra6",
    "Weapon3",
    "Weapon3AB",
    "Weapon3Damage",
    "Weapon3Special",
    "Weapon4",
    "Weapon4AB",
    "Weapon4Damage",
    "Weapon4Special",
    "Feat6",
    "Feat7",
    "Weapon1Special",
    "Weapon1Ammo",
    "Weapon1Weight",
    "Weapon1Size",
    "Weapon1Type",
    "Weapon2Type",
    "HPHD",
    "HP",
    "HPWounds",
    "Spell12",
    "Spell12Cast",
    "Campaign",
    "Spell22",
    "SpellDC0",
    "SpellDC1",
    "BonusSpells1",
    "Gear02",
    "Gear03",
    "Gear04",
    "Gear05",
    "Gear06",
    "Gear07",
    "Gear08",
    "Gear09",
    "Gear10",
    "Gear11",
    "Gear12",
    "Gear13",
    "Gear14",
    "Gear15",
    "Gear16",
    "XPChange",
    "Weapon3Crit",
    "Weapon3Range",
    "SpellPerDay2",
    "BonusSpells2",
    "SpellDC2",
    "Feat19",
    "Feat20",
    "Feat8"
})
public class Jsondata {

    @JsonProperty("Skill01")
    private String skill01;
    @JsonProperty("Skill01Ab")
    private String skill01Ab;
    @JsonProperty("Skill01CC")
    private String skill01CC;
    @JsonProperty("Skill01AbMod")
    private String skill01AbMod;
    @JsonProperty("Skill01Rank")
    private String skill01Rank;
    @JsonProperty("Skill01MiscMod")
    private String skill01MiscMod;
    @JsonProperty("Skill01ACP")
    private String skill01ACP;
    @JsonProperty("Skill01Mod")
    private String skill01Mod;
    @JsonProperty("Skill02")
    private String skill02;
    @JsonProperty("Skill02Ab")
    private String skill02Ab;
    @JsonProperty("Skill02CC")
    private String skill02CC;
    @JsonProperty("Skill02AbMod")
    private String skill02AbMod;
    @JsonProperty("Skill02Rank")
    private String skill02Rank;
    @JsonProperty("Skill02MiscMod")
    private String skill02MiscMod;
    @JsonProperty("Skill02ACP")
    private String skill02ACP;
    @JsonProperty("Skill02Mod")
    private String skill02Mod;
    @JsonProperty("Skill03")
    private String skill03;
    @JsonProperty("Skill03Ab")
    private String skill03Ab;
    @JsonProperty("Skill03CC")
    private String skill03CC;
    @JsonProperty("Skill03AbMod")
    private String skill03AbMod;
    @JsonProperty("Skill03Rank")
    private String skill03Rank;
    @JsonProperty("Skill03MiscMod")
    private String skill03MiscMod;
    @JsonProperty("Skill03ACP")
    private String skill03ACP;
    @JsonProperty("Skill03Mod")
    private String skill03Mod;
    @JsonProperty("Skill04")
    private String skill04;
    @JsonProperty("Skill04Ab")
    private String skill04Ab;
    @JsonProperty("Skill04CC")
    private String skill04CC;
    @JsonProperty("Skill04AbMod")
    private String skill04AbMod;
    @JsonProperty("Skill04Rank")
    private String skill04Rank;
    @JsonProperty("Skill04MiscMod")
    private String skill04MiscMod;
    @JsonProperty("Skill04ACP")
    private String skill04ACP;
    @JsonProperty("Skill04Mod")
    private String skill04Mod;
    @JsonProperty("Skill05")
    private String skill05;
    @JsonProperty("Skill05Ab")
    private String skill05Ab;
    @JsonProperty("Skill05CC")
    private String skill05CC;
    @JsonProperty("Skill05AbMod")
    private String skill05AbMod;
    @JsonProperty("Skill05Rank")
    private String skill05Rank;
    @JsonProperty("Skill05MiscMod")
    private String skill05MiscMod;
    @JsonProperty("Skill05ACP")
    private String skill05ACP;
    @JsonProperty("Skill05Mod")
    private String skill05Mod;
    @JsonProperty("Skill06")
    private String skill06;
    @JsonProperty("Skill06Ab")
    private String skill06Ab;
    @JsonProperty("Skill06CC")
    private String skill06CC;
    @JsonProperty("Skill06AbMod")
    private String skill06AbMod;
    @JsonProperty("Skill06Rank")
    private String skill06Rank;
    @JsonProperty("Skill06MiscMod")
    private String skill06MiscMod;
    @JsonProperty("Skill06ACP")
    private String skill06ACP;
    @JsonProperty("Skill06Mod")
    private String skill06Mod;
    @JsonProperty("Skill07")
    private String skill07;
    @JsonProperty("Skill07Ab")
    private String skill07Ab;
    @JsonProperty("Skill07CC")
    private String skill07CC;
    @JsonProperty("Skill07AbMod")
    private String skill07AbMod;
    @JsonProperty("Skill07Rank")
    private String skill07Rank;
    @JsonProperty("Skill07MiscMod")
    private String skill07MiscMod;
    @JsonProperty("Skill07ACP")
    private String skill07ACP;
    @JsonProperty("Skill07Mod")
    private String skill07Mod;
    @JsonProperty("Skill08")
    private String skill08;
    @JsonProperty("Skill08Ab")
    private String skill08Ab;
    @JsonProperty("Skill08CC")
    private String skill08CC;
    @JsonProperty("Skill08AbMod")
    private String skill08AbMod;
    @JsonProperty("Skill08Rank")
    private String skill08Rank;
    @JsonProperty("Skill08MiscMod")
    private String skill08MiscMod;
    @JsonProperty("Skill08ACP")
    private String skill08ACP;
    @JsonProperty("Skill08Mod")
    private String skill08Mod;
    @JsonProperty("Skill09")
    private String skill09;
    @JsonProperty("Skill09Ab")
    private String skill09Ab;
    @JsonProperty("Skill09CC")
    private String skill09CC;
    @JsonProperty("Skill09AbMod")
    private String skill09AbMod;
    @JsonProperty("Skill09Rank")
    private String skill09Rank;
    @JsonProperty("Skill09MiscMod")
    private String skill09MiscMod;
    @JsonProperty("Skill09ACP")
    private String skill09ACP;
    @JsonProperty("Skill09Mod")
    private String skill09Mod;
    @JsonProperty("Skill10")
    private String skill10;
    @JsonProperty("Skill10Ab")
    private String skill10Ab;
    @JsonProperty("Skill10CC")
    private String skill10CC;
    @JsonProperty("Skill10AbMod")
    private String skill10AbMod;
    @JsonProperty("Skill10Rank")
    private String skill10Rank;
    @JsonProperty("Skill10MiscMod")
    private String skill10MiscMod;
    @JsonProperty("Skill10ACP")
    private String skill10ACP;
    @JsonProperty("Skill10Mod")
    private String skill10Mod;
    @JsonProperty("Skill11")
    private String skill11;
    @JsonProperty("Skill11Ab")
    private String skill11Ab;
    @JsonProperty("Skill11CC")
    private String skill11CC;
    @JsonProperty("Skill11AbMod")
    private String skill11AbMod;
    @JsonProperty("Skill11Rank")
    private String skill11Rank;
    @JsonProperty("Skill11MiscMod")
    private String skill11MiscMod;
    @JsonProperty("Skill11ACP")
    private String skill11ACP;
    @JsonProperty("Skill11Mod")
    private String skill11Mod;
    @JsonProperty("Skill12")
    private String skill12;
    @JsonProperty("Skill12Ab")
    private String skill12Ab;
    @JsonProperty("Skill12CC")
    private String skill12CC;
    @JsonProperty("Skill12AbMod")
    private String skill12AbMod;
    @JsonProperty("Skill12Rank")
    private String skill12Rank;
    @JsonProperty("Skill12MiscMod")
    private String skill12MiscMod;
    @JsonProperty("Skill12ACP")
    private String skill12ACP;
    @JsonProperty("Skill12Mod")
    private String skill12Mod;
    @JsonProperty("Skill13")
    private String skill13;
    @JsonProperty("Skill13Ab")
    private String skill13Ab;
    @JsonProperty("Skill13CC")
    private String skill13CC;
    @JsonProperty("Skill13AbMod")
    private String skill13AbMod;
    @JsonProperty("Skill13Rank")
    private String skill13Rank;
    @JsonProperty("Skill13MiscMod")
    private String skill13MiscMod;
    @JsonProperty("Skill13ACP")
    private String skill13ACP;
    @JsonProperty("Skill13Mod")
    private String skill13Mod;
    @JsonProperty("Skill14")
    private String skill14;
    @JsonProperty("Skill14Ab")
    private String skill14Ab;
    @JsonProperty("Skill14CC")
    private String skill14CC;
    @JsonProperty("Skill14AbMod")
    private String skill14AbMod;
    @JsonProperty("Skill14Rank")
    private String skill14Rank;
    @JsonProperty("Skill14MiscMod")
    private String skill14MiscMod;
    @JsonProperty("Skill14ACP")
    private String skill14ACP;
    @JsonProperty("Skill14Mod")
    private String skill14Mod;
    @JsonProperty("Skill15")
    private String skill15;
    @JsonProperty("Skill15Ab")
    private String skill15Ab;
    @JsonProperty("Skill15CC")
    private String skill15CC;
    @JsonProperty("Skill15AbMod")
    private String skill15AbMod;
    @JsonProperty("Skill15Rank")
    private String skill15Rank;
    @JsonProperty("Skill15MiscMod")
    private String skill15MiscMod;
    @JsonProperty("Skill15ACP")
    private String skill15ACP;
    @JsonProperty("Skill15Mod")
    private String skill15Mod;
    @JsonProperty("Skill16")
    private String skill16;
    @JsonProperty("Skill16Ab")
    private String skill16Ab;
    @JsonProperty("Skill16CC")
    private String skill16CC;
    @JsonProperty("Skill16AbMod")
    private String skill16AbMod;
    @JsonProperty("Skill16Rank")
    private String skill16Rank;
    @JsonProperty("Skill16MiscMod")
    private String skill16MiscMod;
    @JsonProperty("Skill16ACP")
    private String skill16ACP;
    @JsonProperty("Skill16Mod")
    private String skill16Mod;
    @JsonProperty("Skill17")
    private String skill17;
    @JsonProperty("Skill17Ab")
    private String skill17Ab;
    @JsonProperty("Skill17CC")
    private String skill17CC;
    @JsonProperty("Skill17AbMod")
    private String skill17AbMod;
    @JsonProperty("Skill17Rank")
    private String skill17Rank;
    @JsonProperty("Skill17MiscMod")
    private String skill17MiscMod;
    @JsonProperty("Skill17ACP")
    private String skill17ACP;
    @JsonProperty("Skill17Mod")
    private String skill17Mod;
    @JsonProperty("Skill18")
    private String skill18;
    @JsonProperty("Skill18Ab")
    private String skill18Ab;
    @JsonProperty("Skill18CC")
    private String skill18CC;
    @JsonProperty("Skill18AbMod")
    private String skill18AbMod;
    @JsonProperty("Skill18Rank")
    private String skill18Rank;
    @JsonProperty("Skill18MiscMod")
    private String skill18MiscMod;
    @JsonProperty("Skill18ACP")
    private String skill18ACP;
    @JsonProperty("Skill18Mod")
    private String skill18Mod;
    @JsonProperty("Skill19")
    private String skill19;
    @JsonProperty("Skill19Ab")
    private String skill19Ab;
    @JsonProperty("Skill19CC")
    private String skill19CC;
    @JsonProperty("Skill19AbMod")
    private String skill19AbMod;
    @JsonProperty("Skill19Rank")
    private String skill19Rank;
    @JsonProperty("Skill19MiscMod")
    private String skill19MiscMod;
    @JsonProperty("Skill19ACP")
    private String skill19ACP;
    @JsonProperty("Skill19Mod")
    private String skill19Mod;
    @JsonProperty("Skill20")
    private String skill20;
    @JsonProperty("Skill20Ab")
    private String skill20Ab;
    @JsonProperty("Skill20CC")
    private String skill20CC;
    @JsonProperty("Skill20AbMod")
    private String skill20AbMod;
    @JsonProperty("Skill20Rank")
    private String skill20Rank;
    @JsonProperty("Skill20MiscMod")
    private String skill20MiscMod;
    @JsonProperty("Skill20ACP")
    private String skill20ACP;
    @JsonProperty("Skill20Mod")
    private String skill20Mod;
    @JsonProperty("Skill21")
    private String skill21;
    @JsonProperty("Skill21Ab")
    private String skill21Ab;
    @JsonProperty("Skill21CC")
    private String skill21CC;
    @JsonProperty("Skill21AbMod")
    private String skill21AbMod;
    @JsonProperty("Skill21Rank")
    private String skill21Rank;
    @JsonProperty("Skill21MiscMod")
    private String skill21MiscMod;
    @JsonProperty("Skill21ACP")
    private String skill21ACP;
    @JsonProperty("Skill21Mod")
    private String skill21Mod;
    @JsonProperty("Skill22")
    private String skill22;
    @JsonProperty("Skill22Ab")
    private String skill22Ab;
    @JsonProperty("Skill22CC")
    private String skill22CC;
    @JsonProperty("Skill22AbMod")
    private String skill22AbMod;
    @JsonProperty("Skill22Rank")
    private String skill22Rank;
    @JsonProperty("Skill22MiscMod")
    private String skill22MiscMod;
    @JsonProperty("Skill22ACP")
    private String skill22ACP;
    @JsonProperty("Skill22Mod")
    private String skill22Mod;
    @JsonProperty("Skill23")
    private String skill23;
    @JsonProperty("Skill23Ab")
    private String skill23Ab;
    @JsonProperty("Skill23CC")
    private String skill23CC;
    @JsonProperty("Skill23AbMod")
    private String skill23AbMod;
    @JsonProperty("Skill23Rank")
    private String skill23Rank;
    @JsonProperty("Skill23MiscMod")
    private String skill23MiscMod;
    @JsonProperty("Skill23ACP")
    private String skill23ACP;
    @JsonProperty("Skill23Mod")
    private String skill23Mod;
    @JsonProperty("Skill24")
    private String skill24;
    @JsonProperty("Skill24Ab")
    private String skill24Ab;
    @JsonProperty("Skill24CC")
    private String skill24CC;
    @JsonProperty("Skill24AbMod")
    private String skill24AbMod;
    @JsonProperty("Skill24Rank")
    private String skill24Rank;
    @JsonProperty("Skill24MiscMod")
    private String skill24MiscMod;
    @JsonProperty("Skill24ACP")
    private String skill24ACP;
    @JsonProperty("Skill24Mod")
    private String skill24Mod;
    @JsonProperty("Skill25")
    private String skill25;
    @JsonProperty("Skill25Ab")
    private String skill25Ab;
    @JsonProperty("Skill25CC")
    private String skill25CC;
    @JsonProperty("Skill25AbMod")
    private String skill25AbMod;
    @JsonProperty("Skill25Rank")
    private String skill25Rank;
    @JsonProperty("Skill25MiscMod")
    private String skill25MiscMod;
    @JsonProperty("Skill25ACP")
    private String skill25ACP;
    @JsonProperty("Skill25Mod")
    private String skill25Mod;
    @JsonProperty("Skill26")
    private String skill26;
    @JsonProperty("Skill26Ab")
    private String skill26Ab;
    @JsonProperty("Skill26CC")
    private String skill26CC;
    @JsonProperty("Skill26AbMod")
    private String skill26AbMod;
    @JsonProperty("Skill26Rank")
    private String skill26Rank;
    @JsonProperty("Skill26MiscMod")
    private String skill26MiscMod;
    @JsonProperty("Skill26ACP")
    private String skill26ACP;
    @JsonProperty("Skill26Mod")
    private String skill26Mod;
    @JsonProperty("Skill27")
    private String skill27;
    @JsonProperty("Skill27Ab")
    private String skill27Ab;
    @JsonProperty("Skill27CC")
    private String skill27CC;
    @JsonProperty("Skill27AbMod")
    private String skill27AbMod;
    @JsonProperty("Skill27Rank")
    private String skill27Rank;
    @JsonProperty("Skill27MiscMod")
    private String skill27MiscMod;
    @JsonProperty("Skill27ACP")
    private String skill27ACP;
    @JsonProperty("Skill27Mod")
    private String skill27Mod;
    @JsonProperty("Skill28")
    private String skill28;
    @JsonProperty("Skill28Ab")
    private String skill28Ab;
    @JsonProperty("Skill28CC")
    private String skill28CC;
    @JsonProperty("Skill28AbMod")
    private String skill28AbMod;
    @JsonProperty("Skill28Rank")
    private String skill28Rank;
    @JsonProperty("Skill28MiscMod")
    private String skill28MiscMod;
    @JsonProperty("Skill28ACP")
    private String skill28ACP;
    @JsonProperty("Skill28Mod")
    private String skill28Mod;
    @JsonProperty("Skill29")
    private String skill29;
    @JsonProperty("Skill29Ab")
    private String skill29Ab;
    @JsonProperty("Skill29CC")
    private String skill29CC;
    @JsonProperty("Skill29AbMod")
    private String skill29AbMod;
    @JsonProperty("Skill29Rank")
    private String skill29Rank;
    @JsonProperty("Skill29MiscMod")
    private String skill29MiscMod;
    @JsonProperty("Skill29ACP")
    private String skill29ACP;
    @JsonProperty("Skill29Mod")
    private String skill29Mod;
    @JsonProperty("Skill30")
    private String skill30;
    @JsonProperty("Skill30Ab")
    private String skill30Ab;
    @JsonProperty("Skill30CC")
    private String skill30CC;
    @JsonProperty("Skill30AbMod")
    private String skill30AbMod;
    @JsonProperty("Skill30Rank")
    private String skill30Rank;
    @JsonProperty("Skill30MiscMod")
    private String skill30MiscMod;
    @JsonProperty("Skill30ACP")
    private String skill30ACP;
    @JsonProperty("Skill30Mod")
    private String skill30Mod;
    @JsonProperty("Skill31")
    private String skill31;
    @JsonProperty("Skill31Ab")
    private String skill31Ab;
    @JsonProperty("Skill31CC")
    private String skill31CC;
    @JsonProperty("Skill31AbMod")
    private String skill31AbMod;
    @JsonProperty("Skill31Rank")
    private String skill31Rank;
    @JsonProperty("Skill31MiscMod")
    private String skill31MiscMod;
    @JsonProperty("Skill31ACP")
    private String skill31ACP;
    @JsonProperty("Skill31Mod")
    private String skill31Mod;
    @JsonProperty("Skill32")
    private String skill32;
    @JsonProperty("Skill32Ab")
    private String skill32Ab;
    @JsonProperty("Skill32CC")
    private String skill32CC;
    @JsonProperty("Skill32AbMod")
    private String skill32AbMod;
    @JsonProperty("Skill32Rank")
    private String skill32Rank;
    @JsonProperty("Skill32MiscMod")
    private String skill32MiscMod;
    @JsonProperty("Skill32ACP")
    private String skill32ACP;
    @JsonProperty("Skill32Mod")
    private String skill32Mod;
    @JsonProperty("Skill33")
    private String skill33;
    @JsonProperty("Skill33Ab")
    private String skill33Ab;
    @JsonProperty("Skill33CC")
    private String skill33CC;
    @JsonProperty("Skill33AbMod")
    private String skill33AbMod;
    @JsonProperty("Skill33Rank")
    private String skill33Rank;
    @JsonProperty("Skill33MiscMod")
    private String skill33MiscMod;
    @JsonProperty("Skill33ACP")
    private String skill33ACP;
    @JsonProperty("Skill33Mod")
    private String skill33Mod;
    @JsonProperty("Skill34")
    private String skill34;
    @JsonProperty("Skill34Ab")
    private String skill34Ab;
    @JsonProperty("Skill34CC")
    private String skill34CC;
    @JsonProperty("Skill34AbMod")
    private String skill34AbMod;
    @JsonProperty("Skill34Rank")
    private String skill34Rank;
    @JsonProperty("Skill34MiscMod")
    private String skill34MiscMod;
    @JsonProperty("Skill34ACP")
    private String skill34ACP;
    @JsonProperty("Skill34Mod")
    private String skill34Mod;
    @JsonProperty("Skill35")
    private String skill35;
    @JsonProperty("Skill35Ab")
    private String skill35Ab;
    @JsonProperty("Skill35CC")
    private String skill35CC;
    @JsonProperty("Skill35AbMod")
    private String skill35AbMod;
    @JsonProperty("Skill35Rank")
    private String skill35Rank;
    @JsonProperty("Skill35MiscMod")
    private String skill35MiscMod;
    @JsonProperty("Skill35ACP")
    private String skill35ACP;
    @JsonProperty("Skill35Mod")
    private String skill35Mod;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Player")
    private String player;
    @JsonProperty("Alignment")
    private String alignment;
    @JsonProperty("XPCurrent")
    private String xPCurrent;
    @JsonProperty("XPNext")
    private String xPNext;
    @JsonProperty("Level")
    private String level;
    @JsonProperty("MaxRank")
    private String maxRank;
    @JsonProperty("_meta_sheet_data_version")
    private String metaSheetDataVersion;
    @JsonProperty("Class")
    private String _class;
    @JsonProperty("Race")
    private String race;
    @JsonProperty("Deity")
    private String deity;
    @JsonProperty("XPSpeed")
    private String xPSpeed;
    @JsonProperty("Size")
    private String size;
    @JsonProperty("LightLoad")
    private String lightLoad;
    @JsonProperty("MediumLoad")
    private String mediumLoad;
    @JsonProperty("HeavyLoad")
    private String heavyLoad;
    @JsonProperty("LiftOverHead")
    private String liftOverHead;
    @JsonProperty("LiftOffGround")
    private String liftOffGround;
    @JsonProperty("LiftPushDrag")
    private String liftPushDrag;
    @JsonProperty("ACSize")
    private String aCSize;
    @JsonProperty("ACArmor")
    private String aCArmor;
    @JsonProperty("ACShield")
    private String aCShield;
    @JsonProperty("ACDex")
    private String aCDex;
    @JsonProperty("ACDodge")
    private String aCDodge;
    @JsonProperty("ACNat")
    private String aCNat;
    @JsonProperty("ACDeflect")
    private String aCDeflect;
    @JsonProperty("ACMisc")
    private String aCMisc;
    @JsonProperty("AC")
    private String aC;
    @JsonProperty("ACTouch")
    private String aCTouch;
    @JsonProperty("ACFlat")
    private String aCFlat;
    @JsonProperty("CMBBase")
    private String cMBBase;
    @JsonProperty("StrMod")
    private String strMod;
    @JsonProperty("CMD")
    private String cMD;
    @JsonProperty("FCMD")
    private String fCMD;
    @JsonProperty("MABSize")
    private String mABSize;
    @JsonProperty("MABBase")
    private String mABBase;
    @JsonProperty("MABStr")
    private String mABStr;
    @JsonProperty("MABMisc")
    private String mABMisc;
    @JsonProperty("MABTemp")
    private String mABTemp;
    @JsonProperty("MBAB")
    private String mBAB;
    @JsonProperty("RABSize")
    private String rABSize;
    @JsonProperty("RABBase")
    private String rABBase;
    @JsonProperty("RABDex")
    private String rABDex;
    @JsonProperty("RABMisc")
    private String rABMisc;
    @JsonProperty("RABTemp")
    private String rABTemp;
    @JsonProperty("RBAB")
    private String rBAB;
    @JsonProperty("CMBSize")
    private String cMBSize;
    @JsonProperty("CMBStr")
    private String cMBStr;
    @JsonProperty("CMBMisc")
    private String cMBMisc;
    @JsonProperty("CMBTemp")
    private String cMBTemp;
    @JsonProperty("CMB")
    private String cMB;
    @JsonProperty("Age")
    private String age;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("Height")
    private String height;
    @JsonProperty("Weight")
    private String weight;
    @JsonProperty("Eyes")
    private String eyes;
    @JsonProperty("Hair")
    private String hair;
    @JsonProperty("Feat1")
    private String feat1;
    @JsonProperty("Feat2")
    private String feat2;
    @JsonProperty("Feat3")
    private String feat3;
    @JsonProperty("Weapon1")
    private String weapon1;
    @JsonProperty("Weapon1AB")
    private String weapon1AB;
    @JsonProperty("Str")
    private String str;
    @JsonProperty("Dex")
    private String dex;
    @JsonProperty("DexMod")
    private String dexMod;
    @JsonProperty("ReflexAbility")
    private String reflexAbility;
    @JsonProperty("ReflexBase")
    private String reflexBase;
    @JsonProperty("ReflexMagic")
    private String reflexMagic;
    @JsonProperty("ReflexMisc")
    private String reflexMisc;
    @JsonProperty("ReflexTemp")
    private String reflexTemp;
    @JsonProperty("Reflex")
    private String reflex;
    @JsonProperty("InitDex")
    private String initDex;
    @JsonProperty("InitMisc")
    private String initMisc;
    @JsonProperty("Init")
    private String init;
    @JsonProperty("Con")
    private String con;
    @JsonProperty("ConMod")
    private String conMod;
    @JsonProperty("FortAbility")
    private String fortAbility;
    @JsonProperty("FortBase")
    private String fortBase;
    @JsonProperty("FortMagic")
    private String fortMagic;
    @JsonProperty("FortMisc")
    private String fortMisc;
    @JsonProperty("FortTemp")
    private String fortTemp;
    @JsonProperty("Fort")
    private String fort;
    @JsonProperty("Int")
    private String _int;
    @JsonProperty("IntMod")
    private String intMod;
    @JsonProperty("Wis")
    private String wis;
    @JsonProperty("WisMod")
    private String wisMod;
    @JsonProperty("WillAbility")
    private String willAbility;
    @JsonProperty("WillBase")
    private String willBase;
    @JsonProperty("WillMagic")
    private String willMagic;
    @JsonProperty("WillMisc")
    private String willMisc;
    @JsonProperty("WillTemp")
    private String willTemp;
    @JsonProperty("Will")
    private String will;
    @JsonProperty("Cha")
    private String cha;
    @JsonProperty("ChaMod")
    private String chaMod;
    @JsonProperty("__txt_Notes")
    private String txtNotes;
    @JsonProperty("__txt_char_contacts")
    private String txtCharContacts;
    @JsonProperty("__txt_char_description")
    private String txtCharDescription;
    @JsonProperty("__txt_char_personality")
    private String txtCharPersonality;
    @JsonProperty("total_ranks")
    private String totalRanks;
    @JsonProperty("Gear01")
    private String gear01;
    @JsonProperty("Feat16")
    private String feat16;
    @JsonProperty("Feat4")
    private String feat4;
    @JsonProperty("SpellsKnown0")
    private String spellsKnown0;
    @JsonProperty("SpellsKnown1")
    private String spellsKnown1;
    @JsonProperty("Spell01Cast")
    private String spell01Cast;
    @JsonProperty("Spell02Cast")
    private String spell02Cast;
    @JsonProperty("Spell03Cast")
    private String spell03Cast;
    @JsonProperty("Spell04Cast")
    private String spell04Cast;
    @JsonProperty("Spell05Cast")
    private String spell05Cast;
    @JsonProperty("Spell06Cast")
    private String spell06Cast;
    @JsonProperty("Spell01")
    private String spell01;
    @JsonProperty("Spell02")
    private String spell02;
    @JsonProperty("Spell03")
    private String spell03;
    @JsonProperty("Spell04")
    private String spell04;
    @JsonProperty("Spell05")
    private String spell05;
    @JsonProperty("Spell06")
    private String spell06;
    @JsonProperty("Spell08Cast")
    private String spell08Cast;
    @JsonProperty("Spell09Cast")
    private String spell09Cast;
    @JsonProperty("Spell10Cast")
    private String spell10Cast;
    @JsonProperty("Spell11Cast")
    private String spell11Cast;
    @JsonProperty("Spell08")
    private String spell08;
    @JsonProperty("Spell09")
    private String spell09;
    @JsonProperty("Spell10")
    private String spell10;
    @JsonProperty("SpellPerDay0")
    private String spellPerDay0;
    @JsonProperty("SpellPerDay1")
    private String spellPerDay1;
    @JsonProperty("Spell11")
    private String spell11;
    @JsonProperty("Feat17")
    private String feat17;
    @JsonProperty("Feat18")
    private String feat18;
    @JsonProperty("Featxtra0")
    private String featxtra0;
    @JsonProperty("Featxtra1")
    private String featxtra1;
    @JsonProperty("Featxtra2")
    private String featxtra2;
    @JsonProperty("Featxtra3")
    private String featxtra3;
    @JsonProperty("Featxtra4")
    private String featxtra4;
    @JsonProperty("Featxtra5")
    private String featxtra5;
    @JsonProperty("Feat5")
    private String feat5;
    @JsonProperty("PicURL")
    private String picURL;
    @JsonProperty("Weapon2")
    private String weapon2;
    @JsonProperty("Weapon2AB")
    private String weapon2AB;
    @JsonProperty("Weapon2Damage")
    private String weapon2Damage;
    @JsonProperty("Weapon1Damage")
    private String weapon1Damage;
    @JsonProperty("Weapon1Crit")
    private String weapon1Crit;
    @JsonProperty("Weapon1Range")
    private String weapon1Range;
    @JsonProperty("Weapon2Crit")
    private String weapon2Crit;
    @JsonProperty("Weapon2Range")
    private String weapon2Range;
    @JsonProperty("ArmorName")
    private String armorName;
    @JsonProperty("ArmorWorn")
    private String armorWorn;
    @JsonProperty("ArmorType")
    private String armorType;
    @JsonProperty("ArmorBonus")
    private String armorBonus;
    @JsonProperty("ArmorCheck")
    private String armorCheck;
    @JsonProperty("ArmorDex")
    private String armorDex;
    @JsonProperty("Weapon2Ammo")
    private String weapon2Ammo;
    @JsonProperty("__txt_private_notes")
    private String txtPrivateNotes;
    @JsonProperty("__txt_char_traits")
    private String txtCharTraits;
    @JsonProperty("__txt_text2")
    private String txtText2;
    @JsonProperty("__txt_Cash")
    private String txtCash;
    @JsonProperty("Speed")
    private String speed;
    @JsonProperty("Armor")
    private String armor;
    @JsonProperty("Featxtra6")
    private String featxtra6;
    @JsonProperty("Weapon3")
    private String weapon3;
    @JsonProperty("Weapon3AB")
    private String weapon3AB;
    @JsonProperty("Weapon3Damage")
    private String weapon3Damage;
    @JsonProperty("Weapon3Special")
    private String weapon3Special;
    @JsonProperty("Weapon4")
    private String weapon4;
    @JsonProperty("Weapon4AB")
    private String weapon4AB;
    @JsonProperty("Weapon4Damage")
    private String weapon4Damage;
    @JsonProperty("Weapon4Special")
    private String weapon4Special;
    @JsonProperty("Feat6")
    private String feat6;
    @JsonProperty("Feat7")
    private String feat7;
    @JsonProperty("Weapon1Special")
    private String weapon1Special;
    @JsonProperty("Weapon1Ammo")
    private String weapon1Ammo;
    @JsonProperty("Weapon1Weight")
    private String weapon1Weight;
    @JsonProperty("Weapon1Size")
    private String weapon1Size;
    @JsonProperty("Weapon1Type")
    private String weapon1Type;
    @JsonProperty("Weapon2Type")
    private String weapon2Type;
    @JsonProperty("HPHD")
    private String hPHD;
    @JsonProperty("HP")
    private String hP;
    @JsonProperty("HPWounds")
    private String hPWounds;
    @JsonProperty("Spell12")
    private String spell12;
    @JsonProperty("Spell12Cast")
    private String spell12Cast;
    @JsonProperty("Campaign")
    private String campaign;
    @JsonProperty("Spell22")
    private String spell22;
    @JsonProperty("SpellDC0")
    private String spellDC0;
    @JsonProperty("SpellDC1")
    private String spellDC1;
    @JsonProperty("BonusSpells1")
    private String bonusSpells1;
    @JsonProperty("Gear02")
    private String gear02;
    @JsonProperty("Gear03")
    private String gear03;
    @JsonProperty("Gear04")
    private String gear04;
    @JsonProperty("Gear05")
    private String gear05;
    @JsonProperty("Gear06")
    private String gear06;
    @JsonProperty("Gear07")
    private String gear07;
    @JsonProperty("Gear08")
    private String gear08;
    @JsonProperty("Gear09")
    private String gear09;
    @JsonProperty("Gear10")
    private String gear10;
    @JsonProperty("Gear11")
    private String gear11;
    @JsonProperty("Gear12")
    private String gear12;
    @JsonProperty("Gear13")
    private String gear13;
    @JsonProperty("Gear14")
    private String gear14;
    @JsonProperty("Gear15")
    private String gear15;
    @JsonProperty("Gear16")
    private String gear16;
    @JsonProperty("XPChange")
    private String xPChange;
    @JsonProperty("Weapon3Crit")
    private String weapon3Crit;
    @JsonProperty("Weapon3Range")
    private String weapon3Range;
    @JsonProperty("SpellPerDay2")
    private String spellPerDay2;
    @JsonProperty("BonusSpells2")
    private String bonusSpells2;
    @JsonProperty("SpellDC2")
    private String spellDC2;
    @JsonProperty("Feat19")
    private String feat19;
    @JsonProperty("Feat20")
    private String feat20;
    @JsonProperty("Feat8")
    private String feat8;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Skill01")
    public String getSkill01() {
        return skill01;
    }

    @JsonProperty("Skill01")
    public void setSkill01(String skill01) {
        this.skill01 = skill01;
    }

    @JsonProperty("Skill01Ab")
    public String getSkill01Ab() {
        return skill01Ab;
    }

    @JsonProperty("Skill01Ab")
    public void setSkill01Ab(String skill01Ab) {
        this.skill01Ab = skill01Ab;
    }

    @JsonProperty("Skill01CC")
    public String getSkill01CC() {
        return skill01CC;
    }

    @JsonProperty("Skill01CC")
    public void setSkill01CC(String skill01CC) {
        this.skill01CC = skill01CC;
    }

    @JsonProperty("Skill01AbMod")
    public String getSkill01AbMod() {
        return skill01AbMod;
    }

    @JsonProperty("Skill01AbMod")
    public void setSkill01AbMod(String skill01AbMod) {
        this.skill01AbMod = skill01AbMod;
    }

    @JsonProperty("Skill01Rank")
    public String getSkill01Rank() {
        return skill01Rank;
    }

    @JsonProperty("Skill01Rank")
    public void setSkill01Rank(String skill01Rank) {
        this.skill01Rank = skill01Rank;
    }

    @JsonProperty("Skill01MiscMod")
    public String getSkill01MiscMod() {
        return skill01MiscMod;
    }

    @JsonProperty("Skill01MiscMod")
    public void setSkill01MiscMod(String skill01MiscMod) {
        this.skill01MiscMod = skill01MiscMod;
    }

    @JsonProperty("Skill01ACP")
    public String getSkill01ACP() {
        return skill01ACP;
    }

    @JsonProperty("Skill01ACP")
    public void setSkill01ACP(String skill01ACP) {
        this.skill01ACP = skill01ACP;
    }

    @JsonProperty("Skill01Mod")
    public String getSkill01Mod() {
        return skill01Mod;
    }

    @JsonProperty("Skill01Mod")
    public void setSkill01Mod(String skill01Mod) {
        this.skill01Mod = skill01Mod;
    }

    @JsonProperty("Skill02")
    public String getSkill02() {
        return skill02;
    }

    @JsonProperty("Skill02")
    public void setSkill02(String skill02) {
        this.skill02 = skill02;
    }

    @JsonProperty("Skill02Ab")
    public String getSkill02Ab() {
        return skill02Ab;
    }

    @JsonProperty("Skill02Ab")
    public void setSkill02Ab(String skill02Ab) {
        this.skill02Ab = skill02Ab;
    }

    @JsonProperty("Skill02CC")
    public String getSkill02CC() {
        return skill02CC;
    }

    @JsonProperty("Skill02CC")
    public void setSkill02CC(String skill02CC) {
        this.skill02CC = skill02CC;
    }

    @JsonProperty("Skill02AbMod")
    public String getSkill02AbMod() {
        return skill02AbMod;
    }

    @JsonProperty("Skill02AbMod")
    public void setSkill02AbMod(String skill02AbMod) {
        this.skill02AbMod = skill02AbMod;
    }

    @JsonProperty("Skill02Rank")
    public String getSkill02Rank() {
        return skill02Rank;
    }

    @JsonProperty("Skill02Rank")
    public void setSkill02Rank(String skill02Rank) {
        this.skill02Rank = skill02Rank;
    }

    @JsonProperty("Skill02MiscMod")
    public String getSkill02MiscMod() {
        return skill02MiscMod;
    }

    @JsonProperty("Skill02MiscMod")
    public void setSkill02MiscMod(String skill02MiscMod) {
        this.skill02MiscMod = skill02MiscMod;
    }

    @JsonProperty("Skill02ACP")
    public String getSkill02ACP() {
        return skill02ACP;
    }

    @JsonProperty("Skill02ACP")
    public void setSkill02ACP(String skill02ACP) {
        this.skill02ACP = skill02ACP;
    }

    @JsonProperty("Skill02Mod")
    public String getSkill02Mod() {
        return skill02Mod;
    }

    @JsonProperty("Skill02Mod")
    public void setSkill02Mod(String skill02Mod) {
        this.skill02Mod = skill02Mod;
    }

    @JsonProperty("Skill03")
    public String getSkill03() {
        return skill03;
    }

    @JsonProperty("Skill03")
    public void setSkill03(String skill03) {
        this.skill03 = skill03;
    }

    @JsonProperty("Skill03Ab")
    public String getSkill03Ab() {
        return skill03Ab;
    }

    @JsonProperty("Skill03Ab")
    public void setSkill03Ab(String skill03Ab) {
        this.skill03Ab = skill03Ab;
    }

    @JsonProperty("Skill03CC")
    public String getSkill03CC() {
        return skill03CC;
    }

    @JsonProperty("Skill03CC")
    public void setSkill03CC(String skill03CC) {
        this.skill03CC = skill03CC;
    }

    @JsonProperty("Skill03AbMod")
    public String getSkill03AbMod() {
        return skill03AbMod;
    }

    @JsonProperty("Skill03AbMod")
    public void setSkill03AbMod(String skill03AbMod) {
        this.skill03AbMod = skill03AbMod;
    }

    @JsonProperty("Skill03Rank")
    public String getSkill03Rank() {
        return skill03Rank;
    }

    @JsonProperty("Skill03Rank")
    public void setSkill03Rank(String skill03Rank) {
        this.skill03Rank = skill03Rank;
    }

    @JsonProperty("Skill03MiscMod")
    public String getSkill03MiscMod() {
        return skill03MiscMod;
    }

    @JsonProperty("Skill03MiscMod")
    public void setSkill03MiscMod(String skill03MiscMod) {
        this.skill03MiscMod = skill03MiscMod;
    }

    @JsonProperty("Skill03ACP")
    public String getSkill03ACP() {
        return skill03ACP;
    }

    @JsonProperty("Skill03ACP")
    public void setSkill03ACP(String skill03ACP) {
        this.skill03ACP = skill03ACP;
    }

    @JsonProperty("Skill03Mod")
    public String getSkill03Mod() {
        return skill03Mod;
    }

    @JsonProperty("Skill03Mod")
    public void setSkill03Mod(String skill03Mod) {
        this.skill03Mod = skill03Mod;
    }

    @JsonProperty("Skill04")
    public String getSkill04() {
        return skill04;
    }

    @JsonProperty("Skill04")
    public void setSkill04(String skill04) {
        this.skill04 = skill04;
    }

    @JsonProperty("Skill04Ab")
    public String getSkill04Ab() {
        return skill04Ab;
    }

    @JsonProperty("Skill04Ab")
    public void setSkill04Ab(String skill04Ab) {
        this.skill04Ab = skill04Ab;
    }

    @JsonProperty("Skill04CC")
    public String getSkill04CC() {
        return skill04CC;
    }

    @JsonProperty("Skill04CC")
    public void setSkill04CC(String skill04CC) {
        this.skill04CC = skill04CC;
    }

    @JsonProperty("Skill04AbMod")
    public String getSkill04AbMod() {
        return skill04AbMod;
    }

    @JsonProperty("Skill04AbMod")
    public void setSkill04AbMod(String skill04AbMod) {
        this.skill04AbMod = skill04AbMod;
    }

    @JsonProperty("Skill04Rank")
    public String getSkill04Rank() {
        return skill04Rank;
    }

    @JsonProperty("Skill04Rank")
    public void setSkill04Rank(String skill04Rank) {
        this.skill04Rank = skill04Rank;
    }

    @JsonProperty("Skill04MiscMod")
    public String getSkill04MiscMod() {
        return skill04MiscMod;
    }

    @JsonProperty("Skill04MiscMod")
    public void setSkill04MiscMod(String skill04MiscMod) {
        this.skill04MiscMod = skill04MiscMod;
    }

    @JsonProperty("Skill04ACP")
    public String getSkill04ACP() {
        return skill04ACP;
    }

    @JsonProperty("Skill04ACP")
    public void setSkill04ACP(String skill04ACP) {
        this.skill04ACP = skill04ACP;
    }

    @JsonProperty("Skill04Mod")
    public String getSkill04Mod() {
        return skill04Mod;
    }

    @JsonProperty("Skill04Mod")
    public void setSkill04Mod(String skill04Mod) {
        this.skill04Mod = skill04Mod;
    }

    @JsonProperty("Skill05")
    public String getSkill05() {
        return skill05;
    }

    @JsonProperty("Skill05")
    public void setSkill05(String skill05) {
        this.skill05 = skill05;
    }

    @JsonProperty("Skill05Ab")
    public String getSkill05Ab() {
        return skill05Ab;
    }

    @JsonProperty("Skill05Ab")
    public void setSkill05Ab(String skill05Ab) {
        this.skill05Ab = skill05Ab;
    }

    @JsonProperty("Skill05CC")
    public String getSkill05CC() {
        return skill05CC;
    }

    @JsonProperty("Skill05CC")
    public void setSkill05CC(String skill05CC) {
        this.skill05CC = skill05CC;
    }

    @JsonProperty("Skill05AbMod")
    public String getSkill05AbMod() {
        return skill05AbMod;
    }

    @JsonProperty("Skill05AbMod")
    public void setSkill05AbMod(String skill05AbMod) {
        this.skill05AbMod = skill05AbMod;
    }

    @JsonProperty("Skill05Rank")
    public String getSkill05Rank() {
        return skill05Rank;
    }

    @JsonProperty("Skill05Rank")
    public void setSkill05Rank(String skill05Rank) {
        this.skill05Rank = skill05Rank;
    }

    @JsonProperty("Skill05MiscMod")
    public String getSkill05MiscMod() {
        return skill05MiscMod;
    }

    @JsonProperty("Skill05MiscMod")
    public void setSkill05MiscMod(String skill05MiscMod) {
        this.skill05MiscMod = skill05MiscMod;
    }

    @JsonProperty("Skill05ACP")
    public String getSkill05ACP() {
        return skill05ACP;
    }

    @JsonProperty("Skill05ACP")
    public void setSkill05ACP(String skill05ACP) {
        this.skill05ACP = skill05ACP;
    }

    @JsonProperty("Skill05Mod")
    public String getSkill05Mod() {
        return skill05Mod;
    }

    @JsonProperty("Skill05Mod")
    public void setSkill05Mod(String skill05Mod) {
        this.skill05Mod = skill05Mod;
    }

    @JsonProperty("Skill06")
    public String getSkill06() {
        return skill06;
    }

    @JsonProperty("Skill06")
    public void setSkill06(String skill06) {
        this.skill06 = skill06;
    }

    @JsonProperty("Skill06Ab")
    public String getSkill06Ab() {
        return skill06Ab;
    }

    @JsonProperty("Skill06Ab")
    public void setSkill06Ab(String skill06Ab) {
        this.skill06Ab = skill06Ab;
    }

    @JsonProperty("Skill06CC")
    public String getSkill06CC() {
        return skill06CC;
    }

    @JsonProperty("Skill06CC")
    public void setSkill06CC(String skill06CC) {
        this.skill06CC = skill06CC;
    }

    @JsonProperty("Skill06AbMod")
    public String getSkill06AbMod() {
        return skill06AbMod;
    }

    @JsonProperty("Skill06AbMod")
    public void setSkill06AbMod(String skill06AbMod) {
        this.skill06AbMod = skill06AbMod;
    }

    @JsonProperty("Skill06Rank")
    public String getSkill06Rank() {
        return skill06Rank;
    }

    @JsonProperty("Skill06Rank")
    public void setSkill06Rank(String skill06Rank) {
        this.skill06Rank = skill06Rank;
    }

    @JsonProperty("Skill06MiscMod")
    public String getSkill06MiscMod() {
        return skill06MiscMod;
    }

    @JsonProperty("Skill06MiscMod")
    public void setSkill06MiscMod(String skill06MiscMod) {
        this.skill06MiscMod = skill06MiscMod;
    }

    @JsonProperty("Skill06ACP")
    public String getSkill06ACP() {
        return skill06ACP;
    }

    @JsonProperty("Skill06ACP")
    public void setSkill06ACP(String skill06ACP) {
        this.skill06ACP = skill06ACP;
    }

    @JsonProperty("Skill06Mod")
    public String getSkill06Mod() {
        return skill06Mod;
    }

    @JsonProperty("Skill06Mod")
    public void setSkill06Mod(String skill06Mod) {
        this.skill06Mod = skill06Mod;
    }

    @JsonProperty("Skill07")
    public String getSkill07() {
        return skill07;
    }

    @JsonProperty("Skill07")
    public void setSkill07(String skill07) {
        this.skill07 = skill07;
    }

    @JsonProperty("Skill07Ab")
    public String getSkill07Ab() {
        return skill07Ab;
    }

    @JsonProperty("Skill07Ab")
    public void setSkill07Ab(String skill07Ab) {
        this.skill07Ab = skill07Ab;
    }

    @JsonProperty("Skill07CC")
    public String getSkill07CC() {
        return skill07CC;
    }

    @JsonProperty("Skill07CC")
    public void setSkill07CC(String skill07CC) {
        this.skill07CC = skill07CC;
    }

    @JsonProperty("Skill07AbMod")
    public String getSkill07AbMod() {
        return skill07AbMod;
    }

    @JsonProperty("Skill07AbMod")
    public void setSkill07AbMod(String skill07AbMod) {
        this.skill07AbMod = skill07AbMod;
    }

    @JsonProperty("Skill07Rank")
    public String getSkill07Rank() {
        return skill07Rank;
    }

    @JsonProperty("Skill07Rank")
    public void setSkill07Rank(String skill07Rank) {
        this.skill07Rank = skill07Rank;
    }

    @JsonProperty("Skill07MiscMod")
    public String getSkill07MiscMod() {
        return skill07MiscMod;
    }

    @JsonProperty("Skill07MiscMod")
    public void setSkill07MiscMod(String skill07MiscMod) {
        this.skill07MiscMod = skill07MiscMod;
    }

    @JsonProperty("Skill07ACP")
    public String getSkill07ACP() {
        return skill07ACP;
    }

    @JsonProperty("Skill07ACP")
    public void setSkill07ACP(String skill07ACP) {
        this.skill07ACP = skill07ACP;
    }

    @JsonProperty("Skill07Mod")
    public String getSkill07Mod() {
        return skill07Mod;
    }

    @JsonProperty("Skill07Mod")
    public void setSkill07Mod(String skill07Mod) {
        this.skill07Mod = skill07Mod;
    }

    @JsonProperty("Skill08")
    public String getSkill08() {
        return skill08;
    }

    @JsonProperty("Skill08")
    public void setSkill08(String skill08) {
        this.skill08 = skill08;
    }

    @JsonProperty("Skill08Ab")
    public String getSkill08Ab() {
        return skill08Ab;
    }

    @JsonProperty("Skill08Ab")
    public void setSkill08Ab(String skill08Ab) {
        this.skill08Ab = skill08Ab;
    }

    @JsonProperty("Skill08CC")
    public String getSkill08CC() {
        return skill08CC;
    }

    @JsonProperty("Skill08CC")
    public void setSkill08CC(String skill08CC) {
        this.skill08CC = skill08CC;
    }

    @JsonProperty("Skill08AbMod")
    public String getSkill08AbMod() {
        return skill08AbMod;
    }

    @JsonProperty("Skill08AbMod")
    public void setSkill08AbMod(String skill08AbMod) {
        this.skill08AbMod = skill08AbMod;
    }

    @JsonProperty("Skill08Rank")
    public String getSkill08Rank() {
        return skill08Rank;
    }

    @JsonProperty("Skill08Rank")
    public void setSkill08Rank(String skill08Rank) {
        this.skill08Rank = skill08Rank;
    }

    @JsonProperty("Skill08MiscMod")
    public String getSkill08MiscMod() {
        return skill08MiscMod;
    }

    @JsonProperty("Skill08MiscMod")
    public void setSkill08MiscMod(String skill08MiscMod) {
        this.skill08MiscMod = skill08MiscMod;
    }

    @JsonProperty("Skill08ACP")
    public String getSkill08ACP() {
        return skill08ACP;
    }

    @JsonProperty("Skill08ACP")
    public void setSkill08ACP(String skill08ACP) {
        this.skill08ACP = skill08ACP;
    }

    @JsonProperty("Skill08Mod")
    public String getSkill08Mod() {
        return skill08Mod;
    }

    @JsonProperty("Skill08Mod")
    public void setSkill08Mod(String skill08Mod) {
        this.skill08Mod = skill08Mod;
    }

    @JsonProperty("Skill09")
    public String getSkill09() {
        return skill09;
    }

    @JsonProperty("Skill09")
    public void setSkill09(String skill09) {
        this.skill09 = skill09;
    }

    @JsonProperty("Skill09Ab")
    public String getSkill09Ab() {
        return skill09Ab;
    }

    @JsonProperty("Skill09Ab")
    public void setSkill09Ab(String skill09Ab) {
        this.skill09Ab = skill09Ab;
    }

    @JsonProperty("Skill09CC")
    public String getSkill09CC() {
        return skill09CC;
    }

    @JsonProperty("Skill09CC")
    public void setSkill09CC(String skill09CC) {
        this.skill09CC = skill09CC;
    }

    @JsonProperty("Skill09AbMod")
    public String getSkill09AbMod() {
        return skill09AbMod;
    }

    @JsonProperty("Skill09AbMod")
    public void setSkill09AbMod(String skill09AbMod) {
        this.skill09AbMod = skill09AbMod;
    }

    @JsonProperty("Skill09Rank")
    public String getSkill09Rank() {
        return skill09Rank;
    }

    @JsonProperty("Skill09Rank")
    public void setSkill09Rank(String skill09Rank) {
        this.skill09Rank = skill09Rank;
    }

    @JsonProperty("Skill09MiscMod")
    public String getSkill09MiscMod() {
        return skill09MiscMod;
    }

    @JsonProperty("Skill09MiscMod")
    public void setSkill09MiscMod(String skill09MiscMod) {
        this.skill09MiscMod = skill09MiscMod;
    }

    @JsonProperty("Skill09ACP")
    public String getSkill09ACP() {
        return skill09ACP;
    }

    @JsonProperty("Skill09ACP")
    public void setSkill09ACP(String skill09ACP) {
        this.skill09ACP = skill09ACP;
    }

    @JsonProperty("Skill09Mod")
    public String getSkill09Mod() {
        return skill09Mod;
    }

    @JsonProperty("Skill09Mod")
    public void setSkill09Mod(String skill09Mod) {
        this.skill09Mod = skill09Mod;
    }

    @JsonProperty("Skill10")
    public String getSkill10() {
        return skill10;
    }

    @JsonProperty("Skill10")
    public void setSkill10(String skill10) {
        this.skill10 = skill10;
    }

    @JsonProperty("Skill10Ab")
    public String getSkill10Ab() {
        return skill10Ab;
    }

    @JsonProperty("Skill10Ab")
    public void setSkill10Ab(String skill10Ab) {
        this.skill10Ab = skill10Ab;
    }

    @JsonProperty("Skill10CC")
    public String getSkill10CC() {
        return skill10CC;
    }

    @JsonProperty("Skill10CC")
    public void setSkill10CC(String skill10CC) {
        this.skill10CC = skill10CC;
    }

    @JsonProperty("Skill10AbMod")
    public String getSkill10AbMod() {
        return skill10AbMod;
    }

    @JsonProperty("Skill10AbMod")
    public void setSkill10AbMod(String skill10AbMod) {
        this.skill10AbMod = skill10AbMod;
    }

    @JsonProperty("Skill10Rank")
    public String getSkill10Rank() {
        return skill10Rank;
    }

    @JsonProperty("Skill10Rank")
    public void setSkill10Rank(String skill10Rank) {
        this.skill10Rank = skill10Rank;
    }

    @JsonProperty("Skill10MiscMod")
    public String getSkill10MiscMod() {
        return skill10MiscMod;
    }

    @JsonProperty("Skill10MiscMod")
    public void setSkill10MiscMod(String skill10MiscMod) {
        this.skill10MiscMod = skill10MiscMod;
    }

    @JsonProperty("Skill10ACP")
    public String getSkill10ACP() {
        return skill10ACP;
    }

    @JsonProperty("Skill10ACP")
    public void setSkill10ACP(String skill10ACP) {
        this.skill10ACP = skill10ACP;
    }

    @JsonProperty("Skill10Mod")
    public String getSkill10Mod() {
        return skill10Mod;
    }

    @JsonProperty("Skill10Mod")
    public void setSkill10Mod(String skill10Mod) {
        this.skill10Mod = skill10Mod;
    }

    @JsonProperty("Skill11")
    public String getSkill11() {
        return skill11;
    }

    @JsonProperty("Skill11")
    public void setSkill11(String skill11) {
        this.skill11 = skill11;
    }

    @JsonProperty("Skill11Ab")
    public String getSkill11Ab() {
        return skill11Ab;
    }

    @JsonProperty("Skill11Ab")
    public void setSkill11Ab(String skill11Ab) {
        this.skill11Ab = skill11Ab;
    }

    @JsonProperty("Skill11CC")
    public String getSkill11CC() {
        return skill11CC;
    }

    @JsonProperty("Skill11CC")
    public void setSkill11CC(String skill11CC) {
        this.skill11CC = skill11CC;
    }

    @JsonProperty("Skill11AbMod")
    public String getSkill11AbMod() {
        return skill11AbMod;
    }

    @JsonProperty("Skill11AbMod")
    public void setSkill11AbMod(String skill11AbMod) {
        this.skill11AbMod = skill11AbMod;
    }

    @JsonProperty("Skill11Rank")
    public String getSkill11Rank() {
        return skill11Rank;
    }

    @JsonProperty("Skill11Rank")
    public void setSkill11Rank(String skill11Rank) {
        this.skill11Rank = skill11Rank;
    }

    @JsonProperty("Skill11MiscMod")
    public String getSkill11MiscMod() {
        return skill11MiscMod;
    }

    @JsonProperty("Skill11MiscMod")
    public void setSkill11MiscMod(String skill11MiscMod) {
        this.skill11MiscMod = skill11MiscMod;
    }

    @JsonProperty("Skill11ACP")
    public String getSkill11ACP() {
        return skill11ACP;
    }

    @JsonProperty("Skill11ACP")
    public void setSkill11ACP(String skill11ACP) {
        this.skill11ACP = skill11ACP;
    }

    @JsonProperty("Skill11Mod")
    public String getSkill11Mod() {
        return skill11Mod;
    }

    @JsonProperty("Skill11Mod")
    public void setSkill11Mod(String skill11Mod) {
        this.skill11Mod = skill11Mod;
    }

    @JsonProperty("Skill12")
    public String getSkill12() {
        return skill12;
    }

    @JsonProperty("Skill12")
    public void setSkill12(String skill12) {
        this.skill12 = skill12;
    }

    @JsonProperty("Skill12Ab")
    public String getSkill12Ab() {
        return skill12Ab;
    }

    @JsonProperty("Skill12Ab")
    public void setSkill12Ab(String skill12Ab) {
        this.skill12Ab = skill12Ab;
    }

    @JsonProperty("Skill12CC")
    public String getSkill12CC() {
        return skill12CC;
    }

    @JsonProperty("Skill12CC")
    public void setSkill12CC(String skill12CC) {
        this.skill12CC = skill12CC;
    }

    @JsonProperty("Skill12AbMod")
    public String getSkill12AbMod() {
        return skill12AbMod;
    }

    @JsonProperty("Skill12AbMod")
    public void setSkill12AbMod(String skill12AbMod) {
        this.skill12AbMod = skill12AbMod;
    }

    @JsonProperty("Skill12Rank")
    public String getSkill12Rank() {
        return skill12Rank;
    }

    @JsonProperty("Skill12Rank")
    public void setSkill12Rank(String skill12Rank) {
        this.skill12Rank = skill12Rank;
    }

    @JsonProperty("Skill12MiscMod")
    public String getSkill12MiscMod() {
        return skill12MiscMod;
    }

    @JsonProperty("Skill12MiscMod")
    public void setSkill12MiscMod(String skill12MiscMod) {
        this.skill12MiscMod = skill12MiscMod;
    }

    @JsonProperty("Skill12ACP")
    public String getSkill12ACP() {
        return skill12ACP;
    }

    @JsonProperty("Skill12ACP")
    public void setSkill12ACP(String skill12ACP) {
        this.skill12ACP = skill12ACP;
    }

    @JsonProperty("Skill12Mod")
    public String getSkill12Mod() {
        return skill12Mod;
    }

    @JsonProperty("Skill12Mod")
    public void setSkill12Mod(String skill12Mod) {
        this.skill12Mod = skill12Mod;
    }

    @JsonProperty("Skill13")
    public String getSkill13() {
        return skill13;
    }

    @JsonProperty("Skill13")
    public void setSkill13(String skill13) {
        this.skill13 = skill13;
    }

    @JsonProperty("Skill13Ab")
    public String getSkill13Ab() {
        return skill13Ab;
    }

    @JsonProperty("Skill13Ab")
    public void setSkill13Ab(String skill13Ab) {
        this.skill13Ab = skill13Ab;
    }

    @JsonProperty("Skill13CC")
    public String getSkill13CC() {
        return skill13CC;
    }

    @JsonProperty("Skill13CC")
    public void setSkill13CC(String skill13CC) {
        this.skill13CC = skill13CC;
    }

    @JsonProperty("Skill13AbMod")
    public String getSkill13AbMod() {
        return skill13AbMod;
    }

    @JsonProperty("Skill13AbMod")
    public void setSkill13AbMod(String skill13AbMod) {
        this.skill13AbMod = skill13AbMod;
    }

    @JsonProperty("Skill13Rank")
    public String getSkill13Rank() {
        return skill13Rank;
    }

    @JsonProperty("Skill13Rank")
    public void setSkill13Rank(String skill13Rank) {
        this.skill13Rank = skill13Rank;
    }

    @JsonProperty("Skill13MiscMod")
    public String getSkill13MiscMod() {
        return skill13MiscMod;
    }

    @JsonProperty("Skill13MiscMod")
    public void setSkill13MiscMod(String skill13MiscMod) {
        this.skill13MiscMod = skill13MiscMod;
    }

    @JsonProperty("Skill13ACP")
    public String getSkill13ACP() {
        return skill13ACP;
    }

    @JsonProperty("Skill13ACP")
    public void setSkill13ACP(String skill13ACP) {
        this.skill13ACP = skill13ACP;
    }

    @JsonProperty("Skill13Mod")
    public String getSkill13Mod() {
        return skill13Mod;
    }

    @JsonProperty("Skill13Mod")
    public void setSkill13Mod(String skill13Mod) {
        this.skill13Mod = skill13Mod;
    }

    @JsonProperty("Skill14")
    public String getSkill14() {
        return skill14;
    }

    @JsonProperty("Skill14")
    public void setSkill14(String skill14) {
        this.skill14 = skill14;
    }

    @JsonProperty("Skill14Ab")
    public String getSkill14Ab() {
        return skill14Ab;
    }

    @JsonProperty("Skill14Ab")
    public void setSkill14Ab(String skill14Ab) {
        this.skill14Ab = skill14Ab;
    }

    @JsonProperty("Skill14CC")
    public String getSkill14CC() {
        return skill14CC;
    }

    @JsonProperty("Skill14CC")
    public void setSkill14CC(String skill14CC) {
        this.skill14CC = skill14CC;
    }

    @JsonProperty("Skill14AbMod")
    public String getSkill14AbMod() {
        return skill14AbMod;
    }

    @JsonProperty("Skill14AbMod")
    public void setSkill14AbMod(String skill14AbMod) {
        this.skill14AbMod = skill14AbMod;
    }

    @JsonProperty("Skill14Rank")
    public String getSkill14Rank() {
        return skill14Rank;
    }

    @JsonProperty("Skill14Rank")
    public void setSkill14Rank(String skill14Rank) {
        this.skill14Rank = skill14Rank;
    }

    @JsonProperty("Skill14MiscMod")
    public String getSkill14MiscMod() {
        return skill14MiscMod;
    }

    @JsonProperty("Skill14MiscMod")
    public void setSkill14MiscMod(String skill14MiscMod) {
        this.skill14MiscMod = skill14MiscMod;
    }

    @JsonProperty("Skill14ACP")
    public String getSkill14ACP() {
        return skill14ACP;
    }

    @JsonProperty("Skill14ACP")
    public void setSkill14ACP(String skill14ACP) {
        this.skill14ACP = skill14ACP;
    }

    @JsonProperty("Skill14Mod")
    public String getSkill14Mod() {
        return skill14Mod;
    }

    @JsonProperty("Skill14Mod")
    public void setSkill14Mod(String skill14Mod) {
        this.skill14Mod = skill14Mod;
    }

    @JsonProperty("Skill15")
    public String getSkill15() {
        return skill15;
    }

    @JsonProperty("Skill15")
    public void setSkill15(String skill15) {
        this.skill15 = skill15;
    }

    @JsonProperty("Skill15Ab")
    public String getSkill15Ab() {
        return skill15Ab;
    }

    @JsonProperty("Skill15Ab")
    public void setSkill15Ab(String skill15Ab) {
        this.skill15Ab = skill15Ab;
    }

    @JsonProperty("Skill15CC")
    public String getSkill15CC() {
        return skill15CC;
    }

    @JsonProperty("Skill15CC")
    public void setSkill15CC(String skill15CC) {
        this.skill15CC = skill15CC;
    }

    @JsonProperty("Skill15AbMod")
    public String getSkill15AbMod() {
        return skill15AbMod;
    }

    @JsonProperty("Skill15AbMod")
    public void setSkill15AbMod(String skill15AbMod) {
        this.skill15AbMod = skill15AbMod;
    }

    @JsonProperty("Skill15Rank")
    public String getSkill15Rank() {
        return skill15Rank;
    }

    @JsonProperty("Skill15Rank")
    public void setSkill15Rank(String skill15Rank) {
        this.skill15Rank = skill15Rank;
    }

    @JsonProperty("Skill15MiscMod")
    public String getSkill15MiscMod() {
        return skill15MiscMod;
    }

    @JsonProperty("Skill15MiscMod")
    public void setSkill15MiscMod(String skill15MiscMod) {
        this.skill15MiscMod = skill15MiscMod;
    }

    @JsonProperty("Skill15ACP")
    public String getSkill15ACP() {
        return skill15ACP;
    }

    @JsonProperty("Skill15ACP")
    public void setSkill15ACP(String skill15ACP) {
        this.skill15ACP = skill15ACP;
    }

    @JsonProperty("Skill15Mod")
    public String getSkill15Mod() {
        return skill15Mod;
    }

    @JsonProperty("Skill15Mod")
    public void setSkill15Mod(String skill15Mod) {
        this.skill15Mod = skill15Mod;
    }

    @JsonProperty("Skill16")
    public String getSkill16() {
        return skill16;
    }

    @JsonProperty("Skill16")
    public void setSkill16(String skill16) {
        this.skill16 = skill16;
    }

    @JsonProperty("Skill16Ab")
    public String getSkill16Ab() {
        return skill16Ab;
    }

    @JsonProperty("Skill16Ab")
    public void setSkill16Ab(String skill16Ab) {
        this.skill16Ab = skill16Ab;
    }

    @JsonProperty("Skill16CC")
    public String getSkill16CC() {
        return skill16CC;
    }

    @JsonProperty("Skill16CC")
    public void setSkill16CC(String skill16CC) {
        this.skill16CC = skill16CC;
    }

    @JsonProperty("Skill16AbMod")
    public String getSkill16AbMod() {
        return skill16AbMod;
    }

    @JsonProperty("Skill16AbMod")
    public void setSkill16AbMod(String skill16AbMod) {
        this.skill16AbMod = skill16AbMod;
    }

    @JsonProperty("Skill16Rank")
    public String getSkill16Rank() {
        return skill16Rank;
    }

    @JsonProperty("Skill16Rank")
    public void setSkill16Rank(String skill16Rank) {
        this.skill16Rank = skill16Rank;
    }

    @JsonProperty("Skill16MiscMod")
    public String getSkill16MiscMod() {
        return skill16MiscMod;
    }

    @JsonProperty("Skill16MiscMod")
    public void setSkill16MiscMod(String skill16MiscMod) {
        this.skill16MiscMod = skill16MiscMod;
    }

    @JsonProperty("Skill16ACP")
    public String getSkill16ACP() {
        return skill16ACP;
    }

    @JsonProperty("Skill16ACP")
    public void setSkill16ACP(String skill16ACP) {
        this.skill16ACP = skill16ACP;
    }

    @JsonProperty("Skill16Mod")
    public String getSkill16Mod() {
        return skill16Mod;
    }

    @JsonProperty("Skill16Mod")
    public void setSkill16Mod(String skill16Mod) {
        this.skill16Mod = skill16Mod;
    }

    @JsonProperty("Skill17")
    public String getSkill17() {
        return skill17;
    }

    @JsonProperty("Skill17")
    public void setSkill17(String skill17) {
        this.skill17 = skill17;
    }

    @JsonProperty("Skill17Ab")
    public String getSkill17Ab() {
        return skill17Ab;
    }

    @JsonProperty("Skill17Ab")
    public void setSkill17Ab(String skill17Ab) {
        this.skill17Ab = skill17Ab;
    }

    @JsonProperty("Skill17CC")
    public String getSkill17CC() {
        return skill17CC;
    }

    @JsonProperty("Skill17CC")
    public void setSkill17CC(String skill17CC) {
        this.skill17CC = skill17CC;
    }

    @JsonProperty("Skill17AbMod")
    public String getSkill17AbMod() {
        return skill17AbMod;
    }

    @JsonProperty("Skill17AbMod")
    public void setSkill17AbMod(String skill17AbMod) {
        this.skill17AbMod = skill17AbMod;
    }

    @JsonProperty("Skill17Rank")
    public String getSkill17Rank() {
        return skill17Rank;
    }

    @JsonProperty("Skill17Rank")
    public void setSkill17Rank(String skill17Rank) {
        this.skill17Rank = skill17Rank;
    }

    @JsonProperty("Skill17MiscMod")
    public String getSkill17MiscMod() {
        return skill17MiscMod;
    }

    @JsonProperty("Skill17MiscMod")
    public void setSkill17MiscMod(String skill17MiscMod) {
        this.skill17MiscMod = skill17MiscMod;
    }

    @JsonProperty("Skill17ACP")
    public String getSkill17ACP() {
        return skill17ACP;
    }

    @JsonProperty("Skill17ACP")
    public void setSkill17ACP(String skill17ACP) {
        this.skill17ACP = skill17ACP;
    }

    @JsonProperty("Skill17Mod")
    public String getSkill17Mod() {
        return skill17Mod;
    }

    @JsonProperty("Skill17Mod")
    public void setSkill17Mod(String skill17Mod) {
        this.skill17Mod = skill17Mod;
    }

    @JsonProperty("Skill18")
    public String getSkill18() {
        return skill18;
    }

    @JsonProperty("Skill18")
    public void setSkill18(String skill18) {
        this.skill18 = skill18;
    }

    @JsonProperty("Skill18Ab")
    public String getSkill18Ab() {
        return skill18Ab;
    }

    @JsonProperty("Skill18Ab")
    public void setSkill18Ab(String skill18Ab) {
        this.skill18Ab = skill18Ab;
    }

    @JsonProperty("Skill18CC")
    public String getSkill18CC() {
        return skill18CC;
    }

    @JsonProperty("Skill18CC")
    public void setSkill18CC(String skill18CC) {
        this.skill18CC = skill18CC;
    }

    @JsonProperty("Skill18AbMod")
    public String getSkill18AbMod() {
        return skill18AbMod;
    }

    @JsonProperty("Skill18AbMod")
    public void setSkill18AbMod(String skill18AbMod) {
        this.skill18AbMod = skill18AbMod;
    }

    @JsonProperty("Skill18Rank")
    public String getSkill18Rank() {
        return skill18Rank;
    }

    @JsonProperty("Skill18Rank")
    public void setSkill18Rank(String skill18Rank) {
        this.skill18Rank = skill18Rank;
    }

    @JsonProperty("Skill18MiscMod")
    public String getSkill18MiscMod() {
        return skill18MiscMod;
    }

    @JsonProperty("Skill18MiscMod")
    public void setSkill18MiscMod(String skill18MiscMod) {
        this.skill18MiscMod = skill18MiscMod;
    }

    @JsonProperty("Skill18ACP")
    public String getSkill18ACP() {
        return skill18ACP;
    }

    @JsonProperty("Skill18ACP")
    public void setSkill18ACP(String skill18ACP) {
        this.skill18ACP = skill18ACP;
    }

    @JsonProperty("Skill18Mod")
    public String getSkill18Mod() {
        return skill18Mod;
    }

    @JsonProperty("Skill18Mod")
    public void setSkill18Mod(String skill18Mod) {
        this.skill18Mod = skill18Mod;
    }

    @JsonProperty("Skill19")
    public String getSkill19() {
        return skill19;
    }

    @JsonProperty("Skill19")
    public void setSkill19(String skill19) {
        this.skill19 = skill19;
    }

    @JsonProperty("Skill19Ab")
    public String getSkill19Ab() {
        return skill19Ab;
    }

    @JsonProperty("Skill19Ab")
    public void setSkill19Ab(String skill19Ab) {
        this.skill19Ab = skill19Ab;
    }

    @JsonProperty("Skill19CC")
    public String getSkill19CC() {
        return skill19CC;
    }

    @JsonProperty("Skill19CC")
    public void setSkill19CC(String skill19CC) {
        this.skill19CC = skill19CC;
    }

    @JsonProperty("Skill19AbMod")
    public String getSkill19AbMod() {
        return skill19AbMod;
    }

    @JsonProperty("Skill19AbMod")
    public void setSkill19AbMod(String skill19AbMod) {
        this.skill19AbMod = skill19AbMod;
    }

    @JsonProperty("Skill19Rank")
    public String getSkill19Rank() {
        return skill19Rank;
    }

    @JsonProperty("Skill19Rank")
    public void setSkill19Rank(String skill19Rank) {
        this.skill19Rank = skill19Rank;
    }

    @JsonProperty("Skill19MiscMod")
    public String getSkill19MiscMod() {
        return skill19MiscMod;
    }

    @JsonProperty("Skill19MiscMod")
    public void setSkill19MiscMod(String skill19MiscMod) {
        this.skill19MiscMod = skill19MiscMod;
    }

    @JsonProperty("Skill19ACP")
    public String getSkill19ACP() {
        return skill19ACP;
    }

    @JsonProperty("Skill19ACP")
    public void setSkill19ACP(String skill19ACP) {
        this.skill19ACP = skill19ACP;
    }

    @JsonProperty("Skill19Mod")
    public String getSkill19Mod() {
        return skill19Mod;
    }

    @JsonProperty("Skill19Mod")
    public void setSkill19Mod(String skill19Mod) {
        this.skill19Mod = skill19Mod;
    }

    @JsonProperty("Skill20")
    public String getSkill20() {
        return skill20;
    }

    @JsonProperty("Skill20")
    public void setSkill20(String skill20) {
        this.skill20 = skill20;
    }

    @JsonProperty("Skill20Ab")
    public String getSkill20Ab() {
        return skill20Ab;
    }

    @JsonProperty("Skill20Ab")
    public void setSkill20Ab(String skill20Ab) {
        this.skill20Ab = skill20Ab;
    }

    @JsonProperty("Skill20CC")
    public String getSkill20CC() {
        return skill20CC;
    }

    @JsonProperty("Skill20CC")
    public void setSkill20CC(String skill20CC) {
        this.skill20CC = skill20CC;
    }

    @JsonProperty("Skill20AbMod")
    public String getSkill20AbMod() {
        return skill20AbMod;
    }

    @JsonProperty("Skill20AbMod")
    public void setSkill20AbMod(String skill20AbMod) {
        this.skill20AbMod = skill20AbMod;
    }

    @JsonProperty("Skill20Rank")
    public String getSkill20Rank() {
        return skill20Rank;
    }

    @JsonProperty("Skill20Rank")
    public void setSkill20Rank(String skill20Rank) {
        this.skill20Rank = skill20Rank;
    }

    @JsonProperty("Skill20MiscMod")
    public String getSkill20MiscMod() {
        return skill20MiscMod;
    }

    @JsonProperty("Skill20MiscMod")
    public void setSkill20MiscMod(String skill20MiscMod) {
        this.skill20MiscMod = skill20MiscMod;
    }

    @JsonProperty("Skill20ACP")
    public String getSkill20ACP() {
        return skill20ACP;
    }

    @JsonProperty("Skill20ACP")
    public void setSkill20ACP(String skill20ACP) {
        this.skill20ACP = skill20ACP;
    }

    @JsonProperty("Skill20Mod")
    public String getSkill20Mod() {
        return skill20Mod;
    }

    @JsonProperty("Skill20Mod")
    public void setSkill20Mod(String skill20Mod) {
        this.skill20Mod = skill20Mod;
    }

    @JsonProperty("Skill21")
    public String getSkill21() {
        return skill21;
    }

    @JsonProperty("Skill21")
    public void setSkill21(String skill21) {
        this.skill21 = skill21;
    }

    @JsonProperty("Skill21Ab")
    public String getSkill21Ab() {
        return skill21Ab;
    }

    @JsonProperty("Skill21Ab")
    public void setSkill21Ab(String skill21Ab) {
        this.skill21Ab = skill21Ab;
    }

    @JsonProperty("Skill21CC")
    public String getSkill21CC() {
        return skill21CC;
    }

    @JsonProperty("Skill21CC")
    public void setSkill21CC(String skill21CC) {
        this.skill21CC = skill21CC;
    }

    @JsonProperty("Skill21AbMod")
    public String getSkill21AbMod() {
        return skill21AbMod;
    }

    @JsonProperty("Skill21AbMod")
    public void setSkill21AbMod(String skill21AbMod) {
        this.skill21AbMod = skill21AbMod;
    }

    @JsonProperty("Skill21Rank")
    public String getSkill21Rank() {
        return skill21Rank;
    }

    @JsonProperty("Skill21Rank")
    public void setSkill21Rank(String skill21Rank) {
        this.skill21Rank = skill21Rank;
    }

    @JsonProperty("Skill21MiscMod")
    public String getSkill21MiscMod() {
        return skill21MiscMod;
    }

    @JsonProperty("Skill21MiscMod")
    public void setSkill21MiscMod(String skill21MiscMod) {
        this.skill21MiscMod = skill21MiscMod;
    }

    @JsonProperty("Skill21ACP")
    public String getSkill21ACP() {
        return skill21ACP;
    }

    @JsonProperty("Skill21ACP")
    public void setSkill21ACP(String skill21ACP) {
        this.skill21ACP = skill21ACP;
    }

    @JsonProperty("Skill21Mod")
    public String getSkill21Mod() {
        return skill21Mod;
    }

    @JsonProperty("Skill21Mod")
    public void setSkill21Mod(String skill21Mod) {
        this.skill21Mod = skill21Mod;
    }

    @JsonProperty("Skill22")
    public String getSkill22() {
        return skill22;
    }

    @JsonProperty("Skill22")
    public void setSkill22(String skill22) {
        this.skill22 = skill22;
    }

    @JsonProperty("Skill22Ab")
    public String getSkill22Ab() {
        return skill22Ab;
    }

    @JsonProperty("Skill22Ab")
    public void setSkill22Ab(String skill22Ab) {
        this.skill22Ab = skill22Ab;
    }

    @JsonProperty("Skill22CC")
    public String getSkill22CC() {
        return skill22CC;
    }

    @JsonProperty("Skill22CC")
    public void setSkill22CC(String skill22CC) {
        this.skill22CC = skill22CC;
    }

    @JsonProperty("Skill22AbMod")
    public String getSkill22AbMod() {
        return skill22AbMod;
    }

    @JsonProperty("Skill22AbMod")
    public void setSkill22AbMod(String skill22AbMod) {
        this.skill22AbMod = skill22AbMod;
    }

    @JsonProperty("Skill22Rank")
    public String getSkill22Rank() {
        return skill22Rank;
    }

    @JsonProperty("Skill22Rank")
    public void setSkill22Rank(String skill22Rank) {
        this.skill22Rank = skill22Rank;
    }

    @JsonProperty("Skill22MiscMod")
    public String getSkill22MiscMod() {
        return skill22MiscMod;
    }

    @JsonProperty("Skill22MiscMod")
    public void setSkill22MiscMod(String skill22MiscMod) {
        this.skill22MiscMod = skill22MiscMod;
    }

    @JsonProperty("Skill22ACP")
    public String getSkill22ACP() {
        return skill22ACP;
    }

    @JsonProperty("Skill22ACP")
    public void setSkill22ACP(String skill22ACP) {
        this.skill22ACP = skill22ACP;
    }

    @JsonProperty("Skill22Mod")
    public String getSkill22Mod() {
        return skill22Mod;
    }

    @JsonProperty("Skill22Mod")
    public void setSkill22Mod(String skill22Mod) {
        this.skill22Mod = skill22Mod;
    }

    @JsonProperty("Skill23")
    public String getSkill23() {
        return skill23;
    }

    @JsonProperty("Skill23")
    public void setSkill23(String skill23) {
        this.skill23 = skill23;
    }

    @JsonProperty("Skill23Ab")
    public String getSkill23Ab() {
        return skill23Ab;
    }

    @JsonProperty("Skill23Ab")
    public void setSkill23Ab(String skill23Ab) {
        this.skill23Ab = skill23Ab;
    }

    @JsonProperty("Skill23CC")
    public String getSkill23CC() {
        return skill23CC;
    }

    @JsonProperty("Skill23CC")
    public void setSkill23CC(String skill23CC) {
        this.skill23CC = skill23CC;
    }

    @JsonProperty("Skill23AbMod")
    public String getSkill23AbMod() {
        return skill23AbMod;
    }

    @JsonProperty("Skill23AbMod")
    public void setSkill23AbMod(String skill23AbMod) {
        this.skill23AbMod = skill23AbMod;
    }

    @JsonProperty("Skill23Rank")
    public String getSkill23Rank() {
        return skill23Rank;
    }

    @JsonProperty("Skill23Rank")
    public void setSkill23Rank(String skill23Rank) {
        this.skill23Rank = skill23Rank;
    }

    @JsonProperty("Skill23MiscMod")
    public String getSkill23MiscMod() {
        return skill23MiscMod;
    }

    @JsonProperty("Skill23MiscMod")
    public void setSkill23MiscMod(String skill23MiscMod) {
        this.skill23MiscMod = skill23MiscMod;
    }

    @JsonProperty("Skill23ACP")
    public String getSkill23ACP() {
        return skill23ACP;
    }

    @JsonProperty("Skill23ACP")
    public void setSkill23ACP(String skill23ACP) {
        this.skill23ACP = skill23ACP;
    }

    @JsonProperty("Skill23Mod")
    public String getSkill23Mod() {
        return skill23Mod;
    }

    @JsonProperty("Skill23Mod")
    public void setSkill23Mod(String skill23Mod) {
        this.skill23Mod = skill23Mod;
    }

    @JsonProperty("Skill24")
    public String getSkill24() {
        return skill24;
    }

    @JsonProperty("Skill24")
    public void setSkill24(String skill24) {
        this.skill24 = skill24;
    }

    @JsonProperty("Skill24Ab")
    public String getSkill24Ab() {
        return skill24Ab;
    }

    @JsonProperty("Skill24Ab")
    public void setSkill24Ab(String skill24Ab) {
        this.skill24Ab = skill24Ab;
    }

    @JsonProperty("Skill24CC")
    public String getSkill24CC() {
        return skill24CC;
    }

    @JsonProperty("Skill24CC")
    public void setSkill24CC(String skill24CC) {
        this.skill24CC = skill24CC;
    }

    @JsonProperty("Skill24AbMod")
    public String getSkill24AbMod() {
        return skill24AbMod;
    }

    @JsonProperty("Skill24AbMod")
    public void setSkill24AbMod(String skill24AbMod) {
        this.skill24AbMod = skill24AbMod;
    }

    @JsonProperty("Skill24Rank")
    public String getSkill24Rank() {
        return skill24Rank;
    }

    @JsonProperty("Skill24Rank")
    public void setSkill24Rank(String skill24Rank) {
        this.skill24Rank = skill24Rank;
    }

    @JsonProperty("Skill24MiscMod")
    public String getSkill24MiscMod() {
        return skill24MiscMod;
    }

    @JsonProperty("Skill24MiscMod")
    public void setSkill24MiscMod(String skill24MiscMod) {
        this.skill24MiscMod = skill24MiscMod;
    }

    @JsonProperty("Skill24ACP")
    public String getSkill24ACP() {
        return skill24ACP;
    }

    @JsonProperty("Skill24ACP")
    public void setSkill24ACP(String skill24ACP) {
        this.skill24ACP = skill24ACP;
    }

    @JsonProperty("Skill24Mod")
    public String getSkill24Mod() {
        return skill24Mod;
    }

    @JsonProperty("Skill24Mod")
    public void setSkill24Mod(String skill24Mod) {
        this.skill24Mod = skill24Mod;
    }

    @JsonProperty("Skill25")
    public String getSkill25() {
        return skill25;
    }

    @JsonProperty("Skill25")
    public void setSkill25(String skill25) {
        this.skill25 = skill25;
    }

    @JsonProperty("Skill25Ab")
    public String getSkill25Ab() {
        return skill25Ab;
    }

    @JsonProperty("Skill25Ab")
    public void setSkill25Ab(String skill25Ab) {
        this.skill25Ab = skill25Ab;
    }

    @JsonProperty("Skill25CC")
    public String getSkill25CC() {
        return skill25CC;
    }

    @JsonProperty("Skill25CC")
    public void setSkill25CC(String skill25CC) {
        this.skill25CC = skill25CC;
    }

    @JsonProperty("Skill25AbMod")
    public String getSkill25AbMod() {
        return skill25AbMod;
    }

    @JsonProperty("Skill25AbMod")
    public void setSkill25AbMod(String skill25AbMod) {
        this.skill25AbMod = skill25AbMod;
    }

    @JsonProperty("Skill25Rank")
    public String getSkill25Rank() {
        return skill25Rank;
    }

    @JsonProperty("Skill25Rank")
    public void setSkill25Rank(String skill25Rank) {
        this.skill25Rank = skill25Rank;
    }

    @JsonProperty("Skill25MiscMod")
    public String getSkill25MiscMod() {
        return skill25MiscMod;
    }

    @JsonProperty("Skill25MiscMod")
    public void setSkill25MiscMod(String skill25MiscMod) {
        this.skill25MiscMod = skill25MiscMod;
    }

    @JsonProperty("Skill25ACP")
    public String getSkill25ACP() {
        return skill25ACP;
    }

    @JsonProperty("Skill25ACP")
    public void setSkill25ACP(String skill25ACP) {
        this.skill25ACP = skill25ACP;
    }

    @JsonProperty("Skill25Mod")
    public String getSkill25Mod() {
        return skill25Mod;
    }

    @JsonProperty("Skill25Mod")
    public void setSkill25Mod(String skill25Mod) {
        this.skill25Mod = skill25Mod;
    }

    @JsonProperty("Skill26")
    public String getSkill26() {
        return skill26;
    }

    @JsonProperty("Skill26")
    public void setSkill26(String skill26) {
        this.skill26 = skill26;
    }

    @JsonProperty("Skill26Ab")
    public String getSkill26Ab() {
        return skill26Ab;
    }

    @JsonProperty("Skill26Ab")
    public void setSkill26Ab(String skill26Ab) {
        this.skill26Ab = skill26Ab;
    }

    @JsonProperty("Skill26CC")
    public String getSkill26CC() {
        return skill26CC;
    }

    @JsonProperty("Skill26CC")
    public void setSkill26CC(String skill26CC) {
        this.skill26CC = skill26CC;
    }

    @JsonProperty("Skill26AbMod")
    public String getSkill26AbMod() {
        return skill26AbMod;
    }

    @JsonProperty("Skill26AbMod")
    public void setSkill26AbMod(String skill26AbMod) {
        this.skill26AbMod = skill26AbMod;
    }

    @JsonProperty("Skill26Rank")
    public String getSkill26Rank() {
        return skill26Rank;
    }

    @JsonProperty("Skill26Rank")
    public void setSkill26Rank(String skill26Rank) {
        this.skill26Rank = skill26Rank;
    }

    @JsonProperty("Skill26MiscMod")
    public String getSkill26MiscMod() {
        return skill26MiscMod;
    }

    @JsonProperty("Skill26MiscMod")
    public void setSkill26MiscMod(String skill26MiscMod) {
        this.skill26MiscMod = skill26MiscMod;
    }

    @JsonProperty("Skill26ACP")
    public String getSkill26ACP() {
        return skill26ACP;
    }

    @JsonProperty("Skill26ACP")
    public void setSkill26ACP(String skill26ACP) {
        this.skill26ACP = skill26ACP;
    }

    @JsonProperty("Skill26Mod")
    public String getSkill26Mod() {
        return skill26Mod;
    }

    @JsonProperty("Skill26Mod")
    public void setSkill26Mod(String skill26Mod) {
        this.skill26Mod = skill26Mod;
    }

    @JsonProperty("Skill27")
    public String getSkill27() {
        return skill27;
    }

    @JsonProperty("Skill27")
    public void setSkill27(String skill27) {
        this.skill27 = skill27;
    }

    @JsonProperty("Skill27Ab")
    public String getSkill27Ab() {
        return skill27Ab;
    }

    @JsonProperty("Skill27Ab")
    public void setSkill27Ab(String skill27Ab) {
        this.skill27Ab = skill27Ab;
    }

    @JsonProperty("Skill27CC")
    public String getSkill27CC() {
        return skill27CC;
    }

    @JsonProperty("Skill27CC")
    public void setSkill27CC(String skill27CC) {
        this.skill27CC = skill27CC;
    }

    @JsonProperty("Skill27AbMod")
    public String getSkill27AbMod() {
        return skill27AbMod;
    }

    @JsonProperty("Skill27AbMod")
    public void setSkill27AbMod(String skill27AbMod) {
        this.skill27AbMod = skill27AbMod;
    }

    @JsonProperty("Skill27Rank")
    public String getSkill27Rank() {
        return skill27Rank;
    }

    @JsonProperty("Skill27Rank")
    public void setSkill27Rank(String skill27Rank) {
        this.skill27Rank = skill27Rank;
    }

    @JsonProperty("Skill27MiscMod")
    public String getSkill27MiscMod() {
        return skill27MiscMod;
    }

    @JsonProperty("Skill27MiscMod")
    public void setSkill27MiscMod(String skill27MiscMod) {
        this.skill27MiscMod = skill27MiscMod;
    }

    @JsonProperty("Skill27ACP")
    public String getSkill27ACP() {
        return skill27ACP;
    }

    @JsonProperty("Skill27ACP")
    public void setSkill27ACP(String skill27ACP) {
        this.skill27ACP = skill27ACP;
    }

    @JsonProperty("Skill27Mod")
    public String getSkill27Mod() {
        return skill27Mod;
    }

    @JsonProperty("Skill27Mod")
    public void setSkill27Mod(String skill27Mod) {
        this.skill27Mod = skill27Mod;
    }

    @JsonProperty("Skill28")
    public String getSkill28() {
        return skill28;
    }

    @JsonProperty("Skill28")
    public void setSkill28(String skill28) {
        this.skill28 = skill28;
    }

    @JsonProperty("Skill28Ab")
    public String getSkill28Ab() {
        return skill28Ab;
    }

    @JsonProperty("Skill28Ab")
    public void setSkill28Ab(String skill28Ab) {
        this.skill28Ab = skill28Ab;
    }

    @JsonProperty("Skill28CC")
    public String getSkill28CC() {
        return skill28CC;
    }

    @JsonProperty("Skill28CC")
    public void setSkill28CC(String skill28CC) {
        this.skill28CC = skill28CC;
    }

    @JsonProperty("Skill28AbMod")
    public String getSkill28AbMod() {
        return skill28AbMod;
    }

    @JsonProperty("Skill28AbMod")
    public void setSkill28AbMod(String skill28AbMod) {
        this.skill28AbMod = skill28AbMod;
    }

    @JsonProperty("Skill28Rank")
    public String getSkill28Rank() {
        return skill28Rank;
    }

    @JsonProperty("Skill28Rank")
    public void setSkill28Rank(String skill28Rank) {
        this.skill28Rank = skill28Rank;
    }

    @JsonProperty("Skill28MiscMod")
    public String getSkill28MiscMod() {
        return skill28MiscMod;
    }

    @JsonProperty("Skill28MiscMod")
    public void setSkill28MiscMod(String skill28MiscMod) {
        this.skill28MiscMod = skill28MiscMod;
    }

    @JsonProperty("Skill28ACP")
    public String getSkill28ACP() {
        return skill28ACP;
    }

    @JsonProperty("Skill28ACP")
    public void setSkill28ACP(String skill28ACP) {
        this.skill28ACP = skill28ACP;
    }

    @JsonProperty("Skill28Mod")
    public String getSkill28Mod() {
        return skill28Mod;
    }

    @JsonProperty("Skill28Mod")
    public void setSkill28Mod(String skill28Mod) {
        this.skill28Mod = skill28Mod;
    }

    @JsonProperty("Skill29")
    public String getSkill29() {
        return skill29;
    }

    @JsonProperty("Skill29")
    public void setSkill29(String skill29) {
        this.skill29 = skill29;
    }

    @JsonProperty("Skill29Ab")
    public String getSkill29Ab() {
        return skill29Ab;
    }

    @JsonProperty("Skill29Ab")
    public void setSkill29Ab(String skill29Ab) {
        this.skill29Ab = skill29Ab;
    }

    @JsonProperty("Skill29CC")
    public String getSkill29CC() {
        return skill29CC;
    }

    @JsonProperty("Skill29CC")
    public void setSkill29CC(String skill29CC) {
        this.skill29CC = skill29CC;
    }

    @JsonProperty("Skill29AbMod")
    public String getSkill29AbMod() {
        return skill29AbMod;
    }

    @JsonProperty("Skill29AbMod")
    public void setSkill29AbMod(String skill29AbMod) {
        this.skill29AbMod = skill29AbMod;
    }

    @JsonProperty("Skill29Rank")
    public String getSkill29Rank() {
        return skill29Rank;
    }

    @JsonProperty("Skill29Rank")
    public void setSkill29Rank(String skill29Rank) {
        this.skill29Rank = skill29Rank;
    }

    @JsonProperty("Skill29MiscMod")
    public String getSkill29MiscMod() {
        return skill29MiscMod;
    }

    @JsonProperty("Skill29MiscMod")
    public void setSkill29MiscMod(String skill29MiscMod) {
        this.skill29MiscMod = skill29MiscMod;
    }

    @JsonProperty("Skill29ACP")
    public String getSkill29ACP() {
        return skill29ACP;
    }

    @JsonProperty("Skill29ACP")
    public void setSkill29ACP(String skill29ACP) {
        this.skill29ACP = skill29ACP;
    }

    @JsonProperty("Skill29Mod")
    public String getSkill29Mod() {
        return skill29Mod;
    }

    @JsonProperty("Skill29Mod")
    public void setSkill29Mod(String skill29Mod) {
        this.skill29Mod = skill29Mod;
    }

    @JsonProperty("Skill30")
    public String getSkill30() {
        return skill30;
    }

    @JsonProperty("Skill30")
    public void setSkill30(String skill30) {
        this.skill30 = skill30;
    }

    @JsonProperty("Skill30Ab")
    public String getSkill30Ab() {
        return skill30Ab;
    }

    @JsonProperty("Skill30Ab")
    public void setSkill30Ab(String skill30Ab) {
        this.skill30Ab = skill30Ab;
    }

    @JsonProperty("Skill30CC")
    public String getSkill30CC() {
        return skill30CC;
    }

    @JsonProperty("Skill30CC")
    public void setSkill30CC(String skill30CC) {
        this.skill30CC = skill30CC;
    }

    @JsonProperty("Skill30AbMod")
    public String getSkill30AbMod() {
        return skill30AbMod;
    }

    @JsonProperty("Skill30AbMod")
    public void setSkill30AbMod(String skill30AbMod) {
        this.skill30AbMod = skill30AbMod;
    }

    @JsonProperty("Skill30Rank")
    public String getSkill30Rank() {
        return skill30Rank;
    }

    @JsonProperty("Skill30Rank")
    public void setSkill30Rank(String skill30Rank) {
        this.skill30Rank = skill30Rank;
    }

    @JsonProperty("Skill30MiscMod")
    public String getSkill30MiscMod() {
        return skill30MiscMod;
    }

    @JsonProperty("Skill30MiscMod")
    public void setSkill30MiscMod(String skill30MiscMod) {
        this.skill30MiscMod = skill30MiscMod;
    }

    @JsonProperty("Skill30ACP")
    public String getSkill30ACP() {
        return skill30ACP;
    }

    @JsonProperty("Skill30ACP")
    public void setSkill30ACP(String skill30ACP) {
        this.skill30ACP = skill30ACP;
    }

    @JsonProperty("Skill30Mod")
    public String getSkill30Mod() {
        return skill30Mod;
    }

    @JsonProperty("Skill30Mod")
    public void setSkill30Mod(String skill30Mod) {
        this.skill30Mod = skill30Mod;
    }

    @JsonProperty("Skill31")
    public String getSkill31() {
        return skill31;
    }

    @JsonProperty("Skill31")
    public void setSkill31(String skill31) {
        this.skill31 = skill31;
    }

    @JsonProperty("Skill31Ab")
    public String getSkill31Ab() {
        return skill31Ab;
    }

    @JsonProperty("Skill31Ab")
    public void setSkill31Ab(String skill31Ab) {
        this.skill31Ab = skill31Ab;
    }

    @JsonProperty("Skill31CC")
    public String getSkill31CC() {
        return skill31CC;
    }

    @JsonProperty("Skill31CC")
    public void setSkill31CC(String skill31CC) {
        this.skill31CC = skill31CC;
    }

    @JsonProperty("Skill31AbMod")
    public String getSkill31AbMod() {
        return skill31AbMod;
    }

    @JsonProperty("Skill31AbMod")
    public void setSkill31AbMod(String skill31AbMod) {
        this.skill31AbMod = skill31AbMod;
    }

    @JsonProperty("Skill31Rank")
    public String getSkill31Rank() {
        return skill31Rank;
    }

    @JsonProperty("Skill31Rank")
    public void setSkill31Rank(String skill31Rank) {
        this.skill31Rank = skill31Rank;
    }

    @JsonProperty("Skill31MiscMod")
    public String getSkill31MiscMod() {
        return skill31MiscMod;
    }

    @JsonProperty("Skill31MiscMod")
    public void setSkill31MiscMod(String skill31MiscMod) {
        this.skill31MiscMod = skill31MiscMod;
    }

    @JsonProperty("Skill31ACP")
    public String getSkill31ACP() {
        return skill31ACP;
    }

    @JsonProperty("Skill31ACP")
    public void setSkill31ACP(String skill31ACP) {
        this.skill31ACP = skill31ACP;
    }

    @JsonProperty("Skill31Mod")
    public String getSkill31Mod() {
        return skill31Mod;
    }

    @JsonProperty("Skill31Mod")
    public void setSkill31Mod(String skill31Mod) {
        this.skill31Mod = skill31Mod;
    }

    @JsonProperty("Skill32")
    public String getSkill32() {
        return skill32;
    }

    @JsonProperty("Skill32")
    public void setSkill32(String skill32) {
        this.skill32 = skill32;
    }

    @JsonProperty("Skill32Ab")
    public String getSkill32Ab() {
        return skill32Ab;
    }

    @JsonProperty("Skill32Ab")
    public void setSkill32Ab(String skill32Ab) {
        this.skill32Ab = skill32Ab;
    }

    @JsonProperty("Skill32CC")
    public String getSkill32CC() {
        return skill32CC;
    }

    @JsonProperty("Skill32CC")
    public void setSkill32CC(String skill32CC) {
        this.skill32CC = skill32CC;
    }

    @JsonProperty("Skill32AbMod")
    public String getSkill32AbMod() {
        return skill32AbMod;
    }

    @JsonProperty("Skill32AbMod")
    public void setSkill32AbMod(String skill32AbMod) {
        this.skill32AbMod = skill32AbMod;
    }

    @JsonProperty("Skill32Rank")
    public String getSkill32Rank() {
        return skill32Rank;
    }

    @JsonProperty("Skill32Rank")
    public void setSkill32Rank(String skill32Rank) {
        this.skill32Rank = skill32Rank;
    }

    @JsonProperty("Skill32MiscMod")
    public String getSkill32MiscMod() {
        return skill32MiscMod;
    }

    @JsonProperty("Skill32MiscMod")
    public void setSkill32MiscMod(String skill32MiscMod) {
        this.skill32MiscMod = skill32MiscMod;
    }

    @JsonProperty("Skill32ACP")
    public String getSkill32ACP() {
        return skill32ACP;
    }

    @JsonProperty("Skill32ACP")
    public void setSkill32ACP(String skill32ACP) {
        this.skill32ACP = skill32ACP;
    }

    @JsonProperty("Skill32Mod")
    public String getSkill32Mod() {
        return skill32Mod;
    }

    @JsonProperty("Skill32Mod")
    public void setSkill32Mod(String skill32Mod) {
        this.skill32Mod = skill32Mod;
    }

    @JsonProperty("Skill33")
    public String getSkill33() {
        return skill33;
    }

    @JsonProperty("Skill33")
    public void setSkill33(String skill33) {
        this.skill33 = skill33;
    }

    @JsonProperty("Skill33Ab")
    public String getSkill33Ab() {
        return skill33Ab;
    }

    @JsonProperty("Skill33Ab")
    public void setSkill33Ab(String skill33Ab) {
        this.skill33Ab = skill33Ab;
    }

    @JsonProperty("Skill33CC")
    public String getSkill33CC() {
        return skill33CC;
    }

    @JsonProperty("Skill33CC")
    public void setSkill33CC(String skill33CC) {
        this.skill33CC = skill33CC;
    }

    @JsonProperty("Skill33AbMod")
    public String getSkill33AbMod() {
        return skill33AbMod;
    }

    @JsonProperty("Skill33AbMod")
    public void setSkill33AbMod(String skill33AbMod) {
        this.skill33AbMod = skill33AbMod;
    }

    @JsonProperty("Skill33Rank")
    public String getSkill33Rank() {
        return skill33Rank;
    }

    @JsonProperty("Skill33Rank")
    public void setSkill33Rank(String skill33Rank) {
        this.skill33Rank = skill33Rank;
    }

    @JsonProperty("Skill33MiscMod")
    public String getSkill33MiscMod() {
        return skill33MiscMod;
    }

    @JsonProperty("Skill33MiscMod")
    public void setSkill33MiscMod(String skill33MiscMod) {
        this.skill33MiscMod = skill33MiscMod;
    }

    @JsonProperty("Skill33ACP")
    public String getSkill33ACP() {
        return skill33ACP;
    }

    @JsonProperty("Skill33ACP")
    public void setSkill33ACP(String skill33ACP) {
        this.skill33ACP = skill33ACP;
    }

    @JsonProperty("Skill33Mod")
    public String getSkill33Mod() {
        return skill33Mod;
    }

    @JsonProperty("Skill33Mod")
    public void setSkill33Mod(String skill33Mod) {
        this.skill33Mod = skill33Mod;
    }

    @JsonProperty("Skill34")
    public String getSkill34() {
        return skill34;
    }

    @JsonProperty("Skill34")
    public void setSkill34(String skill34) {
        this.skill34 = skill34;
    }

    @JsonProperty("Skill34Ab")
    public String getSkill34Ab() {
        return skill34Ab;
    }

    @JsonProperty("Skill34Ab")
    public void setSkill34Ab(String skill34Ab) {
        this.skill34Ab = skill34Ab;
    }

    @JsonProperty("Skill34CC")
    public String getSkill34CC() {
        return skill34CC;
    }

    @JsonProperty("Skill34CC")
    public void setSkill34CC(String skill34CC) {
        this.skill34CC = skill34CC;
    }

    @JsonProperty("Skill34AbMod")
    public String getSkill34AbMod() {
        return skill34AbMod;
    }

    @JsonProperty("Skill34AbMod")
    public void setSkill34AbMod(String skill34AbMod) {
        this.skill34AbMod = skill34AbMod;
    }

    @JsonProperty("Skill34Rank")
    public String getSkill34Rank() {
        return skill34Rank;
    }

    @JsonProperty("Skill34Rank")
    public void setSkill34Rank(String skill34Rank) {
        this.skill34Rank = skill34Rank;
    }

    @JsonProperty("Skill34MiscMod")
    public String getSkill34MiscMod() {
        return skill34MiscMod;
    }

    @JsonProperty("Skill34MiscMod")
    public void setSkill34MiscMod(String skill34MiscMod) {
        this.skill34MiscMod = skill34MiscMod;
    }

    @JsonProperty("Skill34ACP")
    public String getSkill34ACP() {
        return skill34ACP;
    }

    @JsonProperty("Skill34ACP")
    public void setSkill34ACP(String skill34ACP) {
        this.skill34ACP = skill34ACP;
    }

    @JsonProperty("Skill34Mod")
    public String getSkill34Mod() {
        return skill34Mod;
    }

    @JsonProperty("Skill34Mod")
    public void setSkill34Mod(String skill34Mod) {
        this.skill34Mod = skill34Mod;
    }

    @JsonProperty("Skill35")
    public String getSkill35() {
        return skill35;
    }

    @JsonProperty("Skill35")
    public void setSkill35(String skill35) {
        this.skill35 = skill35;
    }

    @JsonProperty("Skill35Ab")
    public String getSkill35Ab() {
        return skill35Ab;
    }

    @JsonProperty("Skill35Ab")
    public void setSkill35Ab(String skill35Ab) {
        this.skill35Ab = skill35Ab;
    }

    @JsonProperty("Skill35CC")
    public String getSkill35CC() {
        return skill35CC;
    }

    @JsonProperty("Skill35CC")
    public void setSkill35CC(String skill35CC) {
        this.skill35CC = skill35CC;
    }

    @JsonProperty("Skill35AbMod")
    public String getSkill35AbMod() {
        return skill35AbMod;
    }

    @JsonProperty("Skill35AbMod")
    public void setSkill35AbMod(String skill35AbMod) {
        this.skill35AbMod = skill35AbMod;
    }

    @JsonProperty("Skill35Rank")
    public String getSkill35Rank() {
        return skill35Rank;
    }

    @JsonProperty("Skill35Rank")
    public void setSkill35Rank(String skill35Rank) {
        this.skill35Rank = skill35Rank;
    }

    @JsonProperty("Skill35MiscMod")
    public String getSkill35MiscMod() {
        return skill35MiscMod;
    }

    @JsonProperty("Skill35MiscMod")
    public void setSkill35MiscMod(String skill35MiscMod) {
        this.skill35MiscMod = skill35MiscMod;
    }

    @JsonProperty("Skill35ACP")
    public String getSkill35ACP() {
        return skill35ACP;
    }

    @JsonProperty("Skill35ACP")
    public void setSkill35ACP(String skill35ACP) {
        this.skill35ACP = skill35ACP;
    }

    @JsonProperty("Skill35Mod")
    public String getSkill35Mod() {
        return skill35Mod;
    }

    @JsonProperty("Skill35Mod")
    public void setSkill35Mod(String skill35Mod) {
        this.skill35Mod = skill35Mod;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Player")
    public String getPlayer() {
        return player;
    }

    @JsonProperty("Player")
    public void setPlayer(String player) {
        this.player = player;
    }

    @JsonProperty("Alignment")
    public String getAlignment() {
        return alignment;
    }

    @JsonProperty("Alignment")
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @JsonProperty("XPCurrent")
    public String getXPCurrent() {
        return xPCurrent;
    }

    @JsonProperty("XPCurrent")
    public void setXPCurrent(String xPCurrent) {
        this.xPCurrent = xPCurrent;
    }

    @JsonProperty("XPNext")
    public String getXPNext() {
        return xPNext;
    }

    @JsonProperty("XPNext")
    public void setXPNext(String xPNext) {
        this.xPNext = xPNext;
    }

    @JsonProperty("Level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("MaxRank")
    public String getMaxRank() {
        return maxRank;
    }

    @JsonProperty("MaxRank")
    public void setMaxRank(String maxRank) {
        this.maxRank = maxRank;
    }

    @JsonProperty("_meta_sheet_data_version")
    public String getMetaSheetDataVersion() {
        return metaSheetDataVersion;
    }

    @JsonProperty("_meta_sheet_data_version")
    public void setMetaSheetDataVersion(String metaSheetDataVersion) {
        this.metaSheetDataVersion = metaSheetDataVersion;
    }

    @JsonProperty("Class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("Class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("Race")
    public String getRace() {
        return race;
    }

    @JsonProperty("Race")
    public void setRace(String race) {
        this.race = race;
    }

    @JsonProperty("Deity")
    public String getDeity() {
        return deity;
    }

    @JsonProperty("Deity")
    public void setDeity(String deity) {
        this.deity = deity;
    }

    @JsonProperty("XPSpeed")
    public String getXPSpeed() {
        return xPSpeed;
    }

    @JsonProperty("XPSpeed")
    public void setXPSpeed(String xPSpeed) {
        this.xPSpeed = xPSpeed;
    }

    @JsonProperty("Size")
    public String getSize() {
        return size;
    }

    @JsonProperty("Size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty("LightLoad")
    public String getLightLoad() {
        return lightLoad;
    }

    @JsonProperty("LightLoad")
    public void setLightLoad(String lightLoad) {
        this.lightLoad = lightLoad;
    }

    @JsonProperty("MediumLoad")
    public String getMediumLoad() {
        return mediumLoad;
    }

    @JsonProperty("MediumLoad")
    public void setMediumLoad(String mediumLoad) {
        this.mediumLoad = mediumLoad;
    }

    @JsonProperty("HeavyLoad")
    public String getHeavyLoad() {
        return heavyLoad;
    }

    @JsonProperty("HeavyLoad")
    public void setHeavyLoad(String heavyLoad) {
        this.heavyLoad = heavyLoad;
    }

    @JsonProperty("LiftOverHead")
    public String getLiftOverHead() {
        return liftOverHead;
    }

    @JsonProperty("LiftOverHead")
    public void setLiftOverHead(String liftOverHead) {
        this.liftOverHead = liftOverHead;
    }

    @JsonProperty("LiftOffGround")
    public String getLiftOffGround() {
        return liftOffGround;
    }

    @JsonProperty("LiftOffGround")
    public void setLiftOffGround(String liftOffGround) {
        this.liftOffGround = liftOffGround;
    }

    @JsonProperty("LiftPushDrag")
    public String getLiftPushDrag() {
        return liftPushDrag;
    }

    @JsonProperty("LiftPushDrag")
    public void setLiftPushDrag(String liftPushDrag) {
        this.liftPushDrag = liftPushDrag;
    }

    @JsonProperty("ACSize")
    public String getACSize() {
        return aCSize;
    }

    @JsonProperty("ACSize")
    public void setACSize(String aCSize) {
        this.aCSize = aCSize;
    }

    @JsonProperty("ACArmor")
    public String getACArmor() {
        return aCArmor;
    }

    @JsonProperty("ACArmor")
    public void setACArmor(String aCArmor) {
        this.aCArmor = aCArmor;
    }

    @JsonProperty("ACShield")
    public String getACShield() {
        return aCShield;
    }

    @JsonProperty("ACShield")
    public void setACShield(String aCShield) {
        this.aCShield = aCShield;
    }

    @JsonProperty("ACDex")
    public String getACDex() {
        return aCDex;
    }

    @JsonProperty("ACDex")
    public void setACDex(String aCDex) {
        this.aCDex = aCDex;
    }

    @JsonProperty("ACDodge")
    public String getACDodge() {
        return aCDodge;
    }

    @JsonProperty("ACDodge")
    public void setACDodge(String aCDodge) {
        this.aCDodge = aCDodge;
    }

    @JsonProperty("ACNat")
    public String getACNat() {
        return aCNat;
    }

    @JsonProperty("ACNat")
    public void setACNat(String aCNat) {
        this.aCNat = aCNat;
    }

    @JsonProperty("ACDeflect")
    public String getACDeflect() {
        return aCDeflect;
    }

    @JsonProperty("ACDeflect")
    public void setACDeflect(String aCDeflect) {
        this.aCDeflect = aCDeflect;
    }

    @JsonProperty("ACMisc")
    public String getACMisc() {
        return aCMisc;
    }

    @JsonProperty("ACMisc")
    public void setACMisc(String aCMisc) {
        this.aCMisc = aCMisc;
    }

    @JsonProperty("AC")
    public String getAC() {
        return aC;
    }

    @JsonProperty("AC")
    public void setAC(String aC) {
        this.aC = aC;
    }

    @JsonProperty("ACTouch")
    public String getACTouch() {
        return aCTouch;
    }

    @JsonProperty("ACTouch")
    public void setACTouch(String aCTouch) {
        this.aCTouch = aCTouch;
    }

    @JsonProperty("ACFlat")
    public String getACFlat() {
        return aCFlat;
    }

    @JsonProperty("ACFlat")
    public void setACFlat(String aCFlat) {
        this.aCFlat = aCFlat;
    }

    @JsonProperty("CMBBase")
    public String getCMBBase() {
        return cMBBase;
    }

    @JsonProperty("CMBBase")
    public void setCMBBase(String cMBBase) {
        this.cMBBase = cMBBase;
    }

    @JsonProperty("StrMod")
    public String getStrMod() {
        return strMod;
    }

    @JsonProperty("StrMod")
    public void setStrMod(String strMod) {
        this.strMod = strMod;
    }

    @JsonProperty("CMD")
    public String getCMD() {
        return cMD;
    }

    @JsonProperty("CMD")
    public void setCMD(String cMD) {
        this.cMD = cMD;
    }

    @JsonProperty("FCMD")
    public String getFCMD() {
        return fCMD;
    }

    @JsonProperty("FCMD")
    public void setFCMD(String fCMD) {
        this.fCMD = fCMD;
    }

    @JsonProperty("MABSize")
    public String getMABSize() {
        return mABSize;
    }

    @JsonProperty("MABSize")
    public void setMABSize(String mABSize) {
        this.mABSize = mABSize;
    }

    @JsonProperty("MABBase")
    public String getMABBase() {
        return mABBase;
    }

    @JsonProperty("MABBase")
    public void setMABBase(String mABBase) {
        this.mABBase = mABBase;
    }

    @JsonProperty("MABStr")
    public String getMABStr() {
        return mABStr;
    }

    @JsonProperty("MABStr")
    public void setMABStr(String mABStr) {
        this.mABStr = mABStr;
    }

    @JsonProperty("MABMisc")
    public String getMABMisc() {
        return mABMisc;
    }

    @JsonProperty("MABMisc")
    public void setMABMisc(String mABMisc) {
        this.mABMisc = mABMisc;
    }

    @JsonProperty("MABTemp")
    public String getMABTemp() {
        return mABTemp;
    }

    @JsonProperty("MABTemp")
    public void setMABTemp(String mABTemp) {
        this.mABTemp = mABTemp;
    }

    @JsonProperty("MBAB")
    public String getMBAB() {
        return mBAB;
    }

    @JsonProperty("MBAB")
    public void setMBAB(String mBAB) {
        this.mBAB = mBAB;
    }

    @JsonProperty("RABSize")
    public String getRABSize() {
        return rABSize;
    }

    @JsonProperty("RABSize")
    public void setRABSize(String rABSize) {
        this.rABSize = rABSize;
    }

    @JsonProperty("RABBase")
    public String getRABBase() {
        return rABBase;
    }

    @JsonProperty("RABBase")
    public void setRABBase(String rABBase) {
        this.rABBase = rABBase;
    }

    @JsonProperty("RABDex")
    public String getRABDex() {
        return rABDex;
    }

    @JsonProperty("RABDex")
    public void setRABDex(String rABDex) {
        this.rABDex = rABDex;
    }

    @JsonProperty("RABMisc")
    public String getRABMisc() {
        return rABMisc;
    }

    @JsonProperty("RABMisc")
    public void setRABMisc(String rABMisc) {
        this.rABMisc = rABMisc;
    }

    @JsonProperty("RABTemp")
    public String getRABTemp() {
        return rABTemp;
    }

    @JsonProperty("RABTemp")
    public void setRABTemp(String rABTemp) {
        this.rABTemp = rABTemp;
    }

    @JsonProperty("RBAB")
    public String getRBAB() {
        return rBAB;
    }

    @JsonProperty("RBAB")
    public void setRBAB(String rBAB) {
        this.rBAB = rBAB;
    }

    @JsonProperty("CMBSize")
    public String getCMBSize() {
        return cMBSize;
    }

    @JsonProperty("CMBSize")
    public void setCMBSize(String cMBSize) {
        this.cMBSize = cMBSize;
    }

    @JsonProperty("CMBStr")
    public String getCMBStr() {
        return cMBStr;
    }

    @JsonProperty("CMBStr")
    public void setCMBStr(String cMBStr) {
        this.cMBStr = cMBStr;
    }

    @JsonProperty("CMBMisc")
    public String getCMBMisc() {
        return cMBMisc;
    }

    @JsonProperty("CMBMisc")
    public void setCMBMisc(String cMBMisc) {
        this.cMBMisc = cMBMisc;
    }

    @JsonProperty("CMBTemp")
    public String getCMBTemp() {
        return cMBTemp;
    }

    @JsonProperty("CMBTemp")
    public void setCMBTemp(String cMBTemp) {
        this.cMBTemp = cMBTemp;
    }

    @JsonProperty("CMB")
    public String getCMB() {
        return cMB;
    }

    @JsonProperty("CMB")
    public void setCMB(String cMB) {
        this.cMB = cMB;
    }

    @JsonProperty("Age")
    public String getAge() {
        return age;
    }

    @JsonProperty("Age")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("Gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("Height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("Height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("Weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("Weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("Eyes")
    public String getEyes() {
        return eyes;
    }

    @JsonProperty("Eyes")
    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    @JsonProperty("Hair")
    public String getHair() {
        return hair;
    }

    @JsonProperty("Hair")
    public void setHair(String hair) {
        this.hair = hair;
    }

    @JsonProperty("Feat1")
    public String getFeat1() {
        return feat1;
    }

    @JsonProperty("Feat1")
    public void setFeat1(String feat1) {
        this.feat1 = feat1;
    }

    @JsonProperty("Feat2")
    public String getFeat2() {
        return feat2;
    }

    @JsonProperty("Feat2")
    public void setFeat2(String feat2) {
        this.feat2 = feat2;
    }

    @JsonProperty("Feat3")
    public String getFeat3() {
        return feat3;
    }

    @JsonProperty("Feat3")
    public void setFeat3(String feat3) {
        this.feat3 = feat3;
    }

    @JsonProperty("Weapon1")
    public String getWeapon1() {
        return weapon1;
    }

    @JsonProperty("Weapon1")
    public void setWeapon1(String weapon1) {
        this.weapon1 = weapon1;
    }

    @JsonProperty("Weapon1AB")
    public String getWeapon1AB() {
        return weapon1AB;
    }

    @JsonProperty("Weapon1AB")
    public void setWeapon1AB(String weapon1AB) {
        this.weapon1AB = weapon1AB;
    }

    @JsonProperty("Str")
    public String getStr() {
        return str;
    }

    @JsonProperty("Str")
    public void setStr(String str) {
        this.str = str;
    }

    @JsonProperty("Dex")
    public String getDex() {
        return dex;
    }

    @JsonProperty("Dex")
    public void setDex(String dex) {
        this.dex = dex;
    }

    @JsonProperty("DexMod")
    public String getDexMod() {
        return dexMod;
    }

    @JsonProperty("DexMod")
    public void setDexMod(String dexMod) {
        this.dexMod = dexMod;
    }

    @JsonProperty("ReflexAbility")
    public String getReflexAbility() {
        return reflexAbility;
    }

    @JsonProperty("ReflexAbility")
    public void setReflexAbility(String reflexAbility) {
        this.reflexAbility = reflexAbility;
    }

    @JsonProperty("ReflexBase")
    public String getReflexBase() {
        return reflexBase;
    }

    @JsonProperty("ReflexBase")
    public void setReflexBase(String reflexBase) {
        this.reflexBase = reflexBase;
    }

    @JsonProperty("ReflexMagic")
    public String getReflexMagic() {
        return reflexMagic;
    }

    @JsonProperty("ReflexMagic")
    public void setReflexMagic(String reflexMagic) {
        this.reflexMagic = reflexMagic;
    }

    @JsonProperty("ReflexMisc")
    public String getReflexMisc() {
        return reflexMisc;
    }

    @JsonProperty("ReflexMisc")
    public void setReflexMisc(String reflexMisc) {
        this.reflexMisc = reflexMisc;
    }

    @JsonProperty("ReflexTemp")
    public String getReflexTemp() {
        return reflexTemp;
    }

    @JsonProperty("ReflexTemp")
    public void setReflexTemp(String reflexTemp) {
        this.reflexTemp = reflexTemp;
    }

    @JsonProperty("Reflex")
    public String getReflex() {
        return reflex;
    }

    @JsonProperty("Reflex")
    public void setReflex(String reflex) {
        this.reflex = reflex;
    }

    @JsonProperty("InitDex")
    public String getInitDex() {
        return initDex;
    }

    @JsonProperty("InitDex")
    public void setInitDex(String initDex) {
        this.initDex = initDex;
    }

    @JsonProperty("InitMisc")
    public String getInitMisc() {
        return initMisc;
    }

    @JsonProperty("InitMisc")
    public void setInitMisc(String initMisc) {
        this.initMisc = initMisc;
    }

    @JsonProperty("Init")
    public String getInit() {
        return init;
    }

    @JsonProperty("Init")
    public void setInit(String init) {
        this.init = init;
    }

    @JsonProperty("Con")
    public String getCon() {
        return con;
    }

    @JsonProperty("Con")
    public void setCon(String con) {
        this.con = con;
    }

    @JsonProperty("ConMod")
    public String getConMod() {
        return conMod;
    }

    @JsonProperty("ConMod")
    public void setConMod(String conMod) {
        this.conMod = conMod;
    }

    @JsonProperty("FortAbility")
    public String getFortAbility() {
        return fortAbility;
    }

    @JsonProperty("FortAbility")
    public void setFortAbility(String fortAbility) {
        this.fortAbility = fortAbility;
    }

    @JsonProperty("FortBase")
    public String getFortBase() {
        return fortBase;
    }

    @JsonProperty("FortBase")
    public void setFortBase(String fortBase) {
        this.fortBase = fortBase;
    }

    @JsonProperty("FortMagic")
    public String getFortMagic() {
        return fortMagic;
    }

    @JsonProperty("FortMagic")
    public void setFortMagic(String fortMagic) {
        this.fortMagic = fortMagic;
    }

    @JsonProperty("FortMisc")
    public String getFortMisc() {
        return fortMisc;
    }

    @JsonProperty("FortMisc")
    public void setFortMisc(String fortMisc) {
        this.fortMisc = fortMisc;
    }

    @JsonProperty("FortTemp")
    public String getFortTemp() {
        return fortTemp;
    }

    @JsonProperty("FortTemp")
    public void setFortTemp(String fortTemp) {
        this.fortTemp = fortTemp;
    }

    @JsonProperty("Fort")
    public String getFort() {
        return fort;
    }

    @JsonProperty("Fort")
    public void setFort(String fort) {
        this.fort = fort;
    }

    @JsonProperty("Int")
    public String getInt() {
        return _int;
    }

    @JsonProperty("Int")
    public void setInt(String _int) {
        this._int = _int;
    }

    @JsonProperty("IntMod")
    public String getIntMod() {
        return intMod;
    }

    @JsonProperty("IntMod")
    public void setIntMod(String intMod) {
        this.intMod = intMod;
    }

    @JsonProperty("Wis")
    public String getWis() {
        return wis;
    }

    @JsonProperty("Wis")
    public void setWis(String wis) {
        this.wis = wis;
    }

    @JsonProperty("WisMod")
    public String getWisMod() {
        return wisMod;
    }

    @JsonProperty("WisMod")
    public void setWisMod(String wisMod) {
        this.wisMod = wisMod;
    }

    @JsonProperty("WillAbility")
    public String getWillAbility() {
        return willAbility;
    }

    @JsonProperty("WillAbility")
    public void setWillAbility(String willAbility) {
        this.willAbility = willAbility;
    }

    @JsonProperty("WillBase")
    public String getWillBase() {
        return willBase;
    }

    @JsonProperty("WillBase")
    public void setWillBase(String willBase) {
        this.willBase = willBase;
    }

    @JsonProperty("WillMagic")
    public String getWillMagic() {
        return willMagic;
    }

    @JsonProperty("WillMagic")
    public void setWillMagic(String willMagic) {
        this.willMagic = willMagic;
    }

    @JsonProperty("WillMisc")
    public String getWillMisc() {
        return willMisc;
    }

    @JsonProperty("WillMisc")
    public void setWillMisc(String willMisc) {
        this.willMisc = willMisc;
    }

    @JsonProperty("WillTemp")
    public String getWillTemp() {
        return willTemp;
    }

    @JsonProperty("WillTemp")
    public void setWillTemp(String willTemp) {
        this.willTemp = willTemp;
    }

    @JsonProperty("Will")
    public String getWill() {
        return will;
    }

    @JsonProperty("Will")
    public void setWill(String will) {
        this.will = will;
    }

    @JsonProperty("Cha")
    public String getCha() {
        return cha;
    }

    @JsonProperty("Cha")
    public void setCha(String cha) {
        this.cha = cha;
    }

    @JsonProperty("ChaMod")
    public String getChaMod() {
        return chaMod;
    }

    @JsonProperty("ChaMod")
    public void setChaMod(String chaMod) {
        this.chaMod = chaMod;
    }

    @JsonProperty("__txt_Notes")
    public String getTxtNotes() {
        return txtNotes;
    }

    @JsonProperty("__txt_Notes")
    public void setTxtNotes(String txtNotes) {
        this.txtNotes = txtNotes;
    }

    @JsonProperty("__txt_char_contacts")
    public String getTxtCharContacts() {
        return txtCharContacts;
    }

    @JsonProperty("__txt_char_contacts")
    public void setTxtCharContacts(String txtCharContacts) {
        this.txtCharContacts = txtCharContacts;
    }

    @JsonProperty("__txt_char_description")
    public String getTxtCharDescription() {
        return txtCharDescription;
    }

    @JsonProperty("__txt_char_description")
    public void setTxtCharDescription(String txtCharDescription) {
        this.txtCharDescription = txtCharDescription;
    }

    @JsonProperty("__txt_char_personality")
    public String getTxtCharPersonality() {
        return txtCharPersonality;
    }

    @JsonProperty("__txt_char_personality")
    public void setTxtCharPersonality(String txtCharPersonality) {
        this.txtCharPersonality = txtCharPersonality;
    }

    @JsonProperty("total_ranks")
    public String getTotalRanks() {
        return totalRanks;
    }

    @JsonProperty("total_ranks")
    public void setTotalRanks(String totalRanks) {
        this.totalRanks = totalRanks;
    }

    @JsonProperty("Gear01")
    public String getGear01() {
        return gear01;
    }

    @JsonProperty("Gear01")
    public void setGear01(String gear01) {
        this.gear01 = gear01;
    }

    @JsonProperty("Feat16")
    public String getFeat16() {
        return feat16;
    }

    @JsonProperty("Feat16")
    public void setFeat16(String feat16) {
        this.feat16 = feat16;
    }

    @JsonProperty("Feat4")
    public String getFeat4() {
        return feat4;
    }

    @JsonProperty("Feat4")
    public void setFeat4(String feat4) {
        this.feat4 = feat4;
    }

    @JsonProperty("SpellsKnown0")
    public String getSpellsKnown0() {
        return spellsKnown0;
    }

    @JsonProperty("SpellsKnown0")
    public void setSpellsKnown0(String spellsKnown0) {
        this.spellsKnown0 = spellsKnown0;
    }

    @JsonProperty("SpellsKnown1")
    public String getSpellsKnown1() {
        return spellsKnown1;
    }

    @JsonProperty("SpellsKnown1")
    public void setSpellsKnown1(String spellsKnown1) {
        this.spellsKnown1 = spellsKnown1;
    }

    @JsonProperty("Spell01Cast")
    public String getSpell01Cast() {
        return spell01Cast;
    }

    @JsonProperty("Spell01Cast")
    public void setSpell01Cast(String spell01Cast) {
        this.spell01Cast = spell01Cast;
    }

    @JsonProperty("Spell02Cast")
    public String getSpell02Cast() {
        return spell02Cast;
    }

    @JsonProperty("Spell02Cast")
    public void setSpell02Cast(String spell02Cast) {
        this.spell02Cast = spell02Cast;
    }

    @JsonProperty("Spell03Cast")
    public String getSpell03Cast() {
        return spell03Cast;
    }

    @JsonProperty("Spell03Cast")
    public void setSpell03Cast(String spell03Cast) {
        this.spell03Cast = spell03Cast;
    }

    @JsonProperty("Spell04Cast")
    public String getSpell04Cast() {
        return spell04Cast;
    }

    @JsonProperty("Spell04Cast")
    public void setSpell04Cast(String spell04Cast) {
        this.spell04Cast = spell04Cast;
    }

    @JsonProperty("Spell05Cast")
    public String getSpell05Cast() {
        return spell05Cast;
    }

    @JsonProperty("Spell05Cast")
    public void setSpell05Cast(String spell05Cast) {
        this.spell05Cast = spell05Cast;
    }

    @JsonProperty("Spell06Cast")
    public String getSpell06Cast() {
        return spell06Cast;
    }

    @JsonProperty("Spell06Cast")
    public void setSpell06Cast(String spell06Cast) {
        this.spell06Cast = spell06Cast;
    }

    @JsonProperty("Spell01")
    public String getSpell01() {
        return spell01;
    }

    @JsonProperty("Spell01")
    public void setSpell01(String spell01) {
        this.spell01 = spell01;
    }

    @JsonProperty("Spell02")
    public String getSpell02() {
        return spell02;
    }

    @JsonProperty("Spell02")
    public void setSpell02(String spell02) {
        this.spell02 = spell02;
    }

    @JsonProperty("Spell03")
    public String getSpell03() {
        return spell03;
    }

    @JsonProperty("Spell03")
    public void setSpell03(String spell03) {
        this.spell03 = spell03;
    }

    @JsonProperty("Spell04")
    public String getSpell04() {
        return spell04;
    }

    @JsonProperty("Spell04")
    public void setSpell04(String spell04) {
        this.spell04 = spell04;
    }

    @JsonProperty("Spell05")
    public String getSpell05() {
        return spell05;
    }

    @JsonProperty("Spell05")
    public void setSpell05(String spell05) {
        this.spell05 = spell05;
    }

    @JsonProperty("Spell06")
    public String getSpell06() {
        return spell06;
    }

    @JsonProperty("Spell06")
    public void setSpell06(String spell06) {
        this.spell06 = spell06;
    }

    @JsonProperty("Spell08Cast")
    public String getSpell08Cast() {
        return spell08Cast;
    }

    @JsonProperty("Spell08Cast")
    public void setSpell08Cast(String spell08Cast) {
        this.spell08Cast = spell08Cast;
    }

    @JsonProperty("Spell09Cast")
    public String getSpell09Cast() {
        return spell09Cast;
    }

    @JsonProperty("Spell09Cast")
    public void setSpell09Cast(String spell09Cast) {
        this.spell09Cast = spell09Cast;
    }

    @JsonProperty("Spell10Cast")
    public String getSpell10Cast() {
        return spell10Cast;
    }

    @JsonProperty("Spell10Cast")
    public void setSpell10Cast(String spell10Cast) {
        this.spell10Cast = spell10Cast;
    }

    @JsonProperty("Spell11Cast")
    public String getSpell11Cast() {
        return spell11Cast;
    }

    @JsonProperty("Spell11Cast")
    public void setSpell11Cast(String spell11Cast) {
        this.spell11Cast = spell11Cast;
    }

    @JsonProperty("Spell08")
    public String getSpell08() {
        return spell08;
    }

    @JsonProperty("Spell08")
    public void setSpell08(String spell08) {
        this.spell08 = spell08;
    }

    @JsonProperty("Spell09")
    public String getSpell09() {
        return spell09;
    }

    @JsonProperty("Spell09")
    public void setSpell09(String spell09) {
        this.spell09 = spell09;
    }

    @JsonProperty("Spell10")
    public String getSpell10() {
        return spell10;
    }

    @JsonProperty("Spell10")
    public void setSpell10(String spell10) {
        this.spell10 = spell10;
    }

    @JsonProperty("SpellPerDay0")
    public String getSpellPerDay0() {
        return spellPerDay0;
    }

    @JsonProperty("SpellPerDay0")
    public void setSpellPerDay0(String spellPerDay0) {
        this.spellPerDay0 = spellPerDay0;
    }

    @JsonProperty("SpellPerDay1")
    public String getSpellPerDay1() {
        return spellPerDay1;
    }

    @JsonProperty("SpellPerDay1")
    public void setSpellPerDay1(String spellPerDay1) {
        this.spellPerDay1 = spellPerDay1;
    }

    @JsonProperty("Spell11")
    public String getSpell11() {
        return spell11;
    }

    @JsonProperty("Spell11")
    public void setSpell11(String spell11) {
        this.spell11 = spell11;
    }

    @JsonProperty("Feat17")
    public String getFeat17() {
        return feat17;
    }

    @JsonProperty("Feat17")
    public void setFeat17(String feat17) {
        this.feat17 = feat17;
    }

    @JsonProperty("Feat18")
    public String getFeat18() {
        return feat18;
    }

    @JsonProperty("Feat18")
    public void setFeat18(String feat18) {
        this.feat18 = feat18;
    }

    @JsonProperty("Featxtra0")
    public String getFeatxtra0() {
        return featxtra0;
    }

    @JsonProperty("Featxtra0")
    public void setFeatxtra0(String featxtra0) {
        this.featxtra0 = featxtra0;
    }

    @JsonProperty("Featxtra1")
    public String getFeatxtra1() {
        return featxtra1;
    }

    @JsonProperty("Featxtra1")
    public void setFeatxtra1(String featxtra1) {
        this.featxtra1 = featxtra1;
    }

    @JsonProperty("Featxtra2")
    public String getFeatxtra2() {
        return featxtra2;
    }

    @JsonProperty("Featxtra2")
    public void setFeatxtra2(String featxtra2) {
        this.featxtra2 = featxtra2;
    }

    @JsonProperty("Featxtra3")
    public String getFeatxtra3() {
        return featxtra3;
    }

    @JsonProperty("Featxtra3")
    public void setFeatxtra3(String featxtra3) {
        this.featxtra3 = featxtra3;
    }

    @JsonProperty("Featxtra4")
    public String getFeatxtra4() {
        return featxtra4;
    }

    @JsonProperty("Featxtra4")
    public void setFeatxtra4(String featxtra4) {
        this.featxtra4 = featxtra4;
    }

    @JsonProperty("Featxtra5")
    public String getFeatxtra5() {
        return featxtra5;
    }

    @JsonProperty("Featxtra5")
    public void setFeatxtra5(String featxtra5) {
        this.featxtra5 = featxtra5;
    }

    @JsonProperty("Feat5")
    public String getFeat5() {
        return feat5;
    }

    @JsonProperty("Feat5")
    public void setFeat5(String feat5) {
        this.feat5 = feat5;
    }

    @JsonProperty("PicURL")
    public String getPicURL() {
        return picURL;
    }

    @JsonProperty("PicURL")
    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    @JsonProperty("Weapon2")
    public String getWeapon2() {
        return weapon2;
    }

    @JsonProperty("Weapon2")
    public void setWeapon2(String weapon2) {
        this.weapon2 = weapon2;
    }

    @JsonProperty("Weapon2AB")
    public String getWeapon2AB() {
        return weapon2AB;
    }

    @JsonProperty("Weapon2AB")
    public void setWeapon2AB(String weapon2AB) {
        this.weapon2AB = weapon2AB;
    }

    @JsonProperty("Weapon2Damage")
    public String getWeapon2Damage() {
        return weapon2Damage;
    }

    @JsonProperty("Weapon2Damage")
    public void setWeapon2Damage(String weapon2Damage) {
        this.weapon2Damage = weapon2Damage;
    }

    @JsonProperty("Weapon1Damage")
    public String getWeapon1Damage() {
        return weapon1Damage;
    }

    @JsonProperty("Weapon1Damage")
    public void setWeapon1Damage(String weapon1Damage) {
        this.weapon1Damage = weapon1Damage;
    }

    @JsonProperty("Weapon1Crit")
    public String getWeapon1Crit() {
        return weapon1Crit;
    }

    @JsonProperty("Weapon1Crit")
    public void setWeapon1Crit(String weapon1Crit) {
        this.weapon1Crit = weapon1Crit;
    }

    @JsonProperty("Weapon1Range")
    public String getWeapon1Range() {
        return weapon1Range;
    }

    @JsonProperty("Weapon1Range")
    public void setWeapon1Range(String weapon1Range) {
        this.weapon1Range = weapon1Range;
    }

    @JsonProperty("Weapon2Crit")
    public String getWeapon2Crit() {
        return weapon2Crit;
    }

    @JsonProperty("Weapon2Crit")
    public void setWeapon2Crit(String weapon2Crit) {
        this.weapon2Crit = weapon2Crit;
    }

    @JsonProperty("Weapon2Range")
    public String getWeapon2Range() {
        return weapon2Range;
    }

    @JsonProperty("Weapon2Range")
    public void setWeapon2Range(String weapon2Range) {
        this.weapon2Range = weapon2Range;
    }

    @JsonProperty("ArmorName")
    public String getArmorName() {
        return armorName;
    }

    @JsonProperty("ArmorName")
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    @JsonProperty("ArmorWorn")
    public String getArmorWorn() {
        return armorWorn;
    }

    @JsonProperty("ArmorWorn")
    public void setArmorWorn(String armorWorn) {
        this.armorWorn = armorWorn;
    }

    @JsonProperty("ArmorType")
    public String getArmorType() {
        return armorType;
    }

    @JsonProperty("ArmorType")
    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    @JsonProperty("ArmorBonus")
    public String getArmorBonus() {
        return armorBonus;
    }

    @JsonProperty("ArmorBonus")
    public void setArmorBonus(String armorBonus) {
        this.armorBonus = armorBonus;
    }

    @JsonProperty("ArmorCheck")
    public String getArmorCheck() {
        return armorCheck;
    }

    @JsonProperty("ArmorCheck")
    public void setArmorCheck(String armorCheck) {
        this.armorCheck = armorCheck;
    }

    @JsonProperty("ArmorDex")
    public String getArmorDex() {
        return armorDex;
    }

    @JsonProperty("ArmorDex")
    public void setArmorDex(String armorDex) {
        this.armorDex = armorDex;
    }

    @JsonProperty("Weapon2Ammo")
    public String getWeapon2Ammo() {
        return weapon2Ammo;
    }

    @JsonProperty("Weapon2Ammo")
    public void setWeapon2Ammo(String weapon2Ammo) {
        this.weapon2Ammo = weapon2Ammo;
    }

    @JsonProperty("__txt_private_notes")
    public String getTxtPrivateNotes() {
        return txtPrivateNotes;
    }

    @JsonProperty("__txt_private_notes")
    public void setTxtPrivateNotes(String txtPrivateNotes) {
        this.txtPrivateNotes = txtPrivateNotes;
    }

    @JsonProperty("__txt_char_traits")
    public String getTxtCharTraits() {
        return txtCharTraits;
    }

    @JsonProperty("__txt_char_traits")
    public void setTxtCharTraits(String txtCharTraits) {
        this.txtCharTraits = txtCharTraits;
    }

    @JsonProperty("__txt_text2")
    public String getTxtText2() {
        return txtText2;
    }

    @JsonProperty("__txt_text2")
    public void setTxtText2(String txtText2) {
        this.txtText2 = txtText2;
    }

    @JsonProperty("__txt_Cash")
    public String getTxtCash() {
        return txtCash;
    }

    @JsonProperty("__txt_Cash")
    public void setTxtCash(String txtCash) {
        this.txtCash = txtCash;
    }

    @JsonProperty("Speed")
    public String getSpeed() {
        return speed;
    }

    @JsonProperty("Speed")
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @JsonProperty("Armor")
    public String getArmor() {
        return armor;
    }

    @JsonProperty("Armor")
    public void setArmor(String armor) {
        this.armor = armor;
    }

    @JsonProperty("Featxtra6")
    public String getFeatxtra6() {
        return featxtra6;
    }

    @JsonProperty("Featxtra6")
    public void setFeatxtra6(String featxtra6) {
        this.featxtra6 = featxtra6;
    }

    @JsonProperty("Weapon3")
    public String getWeapon3() {
        return weapon3;
    }

    @JsonProperty("Weapon3")
    public void setWeapon3(String weapon3) {
        this.weapon3 = weapon3;
    }

    @JsonProperty("Weapon3AB")
    public String getWeapon3AB() {
        return weapon3AB;
    }

    @JsonProperty("Weapon3AB")
    public void setWeapon3AB(String weapon3AB) {
        this.weapon3AB = weapon3AB;
    }

    @JsonProperty("Weapon3Damage")
    public String getWeapon3Damage() {
        return weapon3Damage;
    }

    @JsonProperty("Weapon3Damage")
    public void setWeapon3Damage(String weapon3Damage) {
        this.weapon3Damage = weapon3Damage;
    }

    @JsonProperty("Weapon3Special")
    public String getWeapon3Special() {
        return weapon3Special;
    }

    @JsonProperty("Weapon3Special")
    public void setWeapon3Special(String weapon3Special) {
        this.weapon3Special = weapon3Special;
    }

    @JsonProperty("Weapon4")
    public String getWeapon4() {
        return weapon4;
    }

    @JsonProperty("Weapon4")
    public void setWeapon4(String weapon4) {
        this.weapon4 = weapon4;
    }

    @JsonProperty("Weapon4AB")
    public String getWeapon4AB() {
        return weapon4AB;
    }

    @JsonProperty("Weapon4AB")
    public void setWeapon4AB(String weapon4AB) {
        this.weapon4AB = weapon4AB;
    }

    @JsonProperty("Weapon4Damage")
    public String getWeapon4Damage() {
        return weapon4Damage;
    }

    @JsonProperty("Weapon4Damage")
    public void setWeapon4Damage(String weapon4Damage) {
        this.weapon4Damage = weapon4Damage;
    }

    @JsonProperty("Weapon4Special")
    public String getWeapon4Special() {
        return weapon4Special;
    }

    @JsonProperty("Weapon4Special")
    public void setWeapon4Special(String weapon4Special) {
        this.weapon4Special = weapon4Special;
    }

    @JsonProperty("Feat6")
    public String getFeat6() {
        return feat6;
    }

    @JsonProperty("Feat6")
    public void setFeat6(String feat6) {
        this.feat6 = feat6;
    }

    @JsonProperty("Feat7")
    public String getFeat7() {
        return feat7;
    }

    @JsonProperty("Feat7")
    public void setFeat7(String feat7) {
        this.feat7 = feat7;
    }

    @JsonProperty("Weapon1Special")
    public String getWeapon1Special() {
        return weapon1Special;
    }

    @JsonProperty("Weapon1Special")
    public void setWeapon1Special(String weapon1Special) {
        this.weapon1Special = weapon1Special;
    }

    @JsonProperty("Weapon1Ammo")
    public String getWeapon1Ammo() {
        return weapon1Ammo;
    }

    @JsonProperty("Weapon1Ammo")
    public void setWeapon1Ammo(String weapon1Ammo) {
        this.weapon1Ammo = weapon1Ammo;
    }

    @JsonProperty("Weapon1Weight")
    public String getWeapon1Weight() {
        return weapon1Weight;
    }

    @JsonProperty("Weapon1Weight")
    public void setWeapon1Weight(String weapon1Weight) {
        this.weapon1Weight = weapon1Weight;
    }

    @JsonProperty("Weapon1Size")
    public String getWeapon1Size() {
        return weapon1Size;
    }

    @JsonProperty("Weapon1Size")
    public void setWeapon1Size(String weapon1Size) {
        this.weapon1Size = weapon1Size;
    }

    @JsonProperty("Weapon1Type")
    public String getWeapon1Type() {
        return weapon1Type;
    }

    @JsonProperty("Weapon1Type")
    public void setWeapon1Type(String weapon1Type) {
        this.weapon1Type = weapon1Type;
    }

    @JsonProperty("Weapon2Type")
    public String getWeapon2Type() {
        return weapon2Type;
    }

    @JsonProperty("Weapon2Type")
    public void setWeapon2Type(String weapon2Type) {
        this.weapon2Type = weapon2Type;
    }

    @JsonProperty("HPHD")
    public String getHPHD() {
        return hPHD;
    }

    @JsonProperty("HPHD")
    public void setHPHD(String hPHD) {
        this.hPHD = hPHD;
    }

    @JsonProperty("HP")
    public String getHP() {
        return hP;
    }

    @JsonProperty("HP")
    public void setHP(String hP) {
        this.hP = hP;
    }

    @JsonProperty("HPWounds")
    public String getHPWounds() {
        return hPWounds;
    }

    @JsonProperty("HPWounds")
    public void setHPWounds(String hPWounds) {
        this.hPWounds = hPWounds;
    }

    @JsonProperty("Spell12")
    public String getSpell12() {
        return spell12;
    }

    @JsonProperty("Spell12")
    public void setSpell12(String spell12) {
        this.spell12 = spell12;
    }

    @JsonProperty("Spell12Cast")
    public String getSpell12Cast() {
        return spell12Cast;
    }

    @JsonProperty("Spell12Cast")
    public void setSpell12Cast(String spell12Cast) {
        this.spell12Cast = spell12Cast;
    }

    @JsonProperty("Campaign")
    public String getCampaign() {
        return campaign;
    }

    @JsonProperty("Campaign")
    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    @JsonProperty("Spell22")
    public String getSpell22() {
        return spell22;
    }

    @JsonProperty("Spell22")
    public void setSpell22(String spell22) {
        this.spell22 = spell22;
    }

    @JsonProperty("SpellDC0")
    public String getSpellDC0() {
        return spellDC0;
    }

    @JsonProperty("SpellDC0")
    public void setSpellDC0(String spellDC0) {
        this.spellDC0 = spellDC0;
    }

    @JsonProperty("SpellDC1")
    public String getSpellDC1() {
        return spellDC1;
    }

    @JsonProperty("SpellDC1")
    public void setSpellDC1(String spellDC1) {
        this.spellDC1 = spellDC1;
    }

    @JsonProperty("BonusSpells1")
    public String getBonusSpells1() {
        return bonusSpells1;
    }

    @JsonProperty("BonusSpells1")
    public void setBonusSpells1(String bonusSpells1) {
        this.bonusSpells1 = bonusSpells1;
    }

    @JsonProperty("Gear02")
    public String getGear02() {
        return gear02;
    }

    @JsonProperty("Gear02")
    public void setGear02(String gear02) {
        this.gear02 = gear02;
    }

    @JsonProperty("Gear03")
    public String getGear03() {
        return gear03;
    }

    @JsonProperty("Gear03")
    public void setGear03(String gear03) {
        this.gear03 = gear03;
    }

    @JsonProperty("Gear04")
    public String getGear04() {
        return gear04;
    }

    @JsonProperty("Gear04")
    public void setGear04(String gear04) {
        this.gear04 = gear04;
    }

    @JsonProperty("Gear05")
    public String getGear05() {
        return gear05;
    }

    @JsonProperty("Gear05")
    public void setGear05(String gear05) {
        this.gear05 = gear05;
    }

    @JsonProperty("Gear06")
    public String getGear06() {
        return gear06;
    }

    @JsonProperty("Gear06")
    public void setGear06(String gear06) {
        this.gear06 = gear06;
    }

    @JsonProperty("Gear07")
    public String getGear07() {
        return gear07;
    }

    @JsonProperty("Gear07")
    public void setGear07(String gear07) {
        this.gear07 = gear07;
    }

    @JsonProperty("Gear08")
    public String getGear08() {
        return gear08;
    }

    @JsonProperty("Gear08")
    public void setGear08(String gear08) {
        this.gear08 = gear08;
    }

    @JsonProperty("Gear09")
    public String getGear09() {
        return gear09;
    }

    @JsonProperty("Gear09")
    public void setGear09(String gear09) {
        this.gear09 = gear09;
    }

    @JsonProperty("Gear10")
    public String getGear10() {
        return gear10;
    }

    @JsonProperty("Gear10")
    public void setGear10(String gear10) {
        this.gear10 = gear10;
    }

    @JsonProperty("Gear11")
    public String getGear11() {
        return gear11;
    }

    @JsonProperty("Gear11")
    public void setGear11(String gear11) {
        this.gear11 = gear11;
    }

    @JsonProperty("Gear12")
    public String getGear12() {
        return gear12;
    }

    @JsonProperty("Gear12")
    public void setGear12(String gear12) {
        this.gear12 = gear12;
    }

    @JsonProperty("Gear13")
    public String getGear13() {
        return gear13;
    }

    @JsonProperty("Gear13")
    public void setGear13(String gear13) {
        this.gear13 = gear13;
    }

    @JsonProperty("Gear14")
    public String getGear14() {
        return gear14;
    }

    @JsonProperty("Gear14")
    public void setGear14(String gear14) {
        this.gear14 = gear14;
    }

    @JsonProperty("Gear15")
    public String getGear15() {
        return gear15;
    }

    @JsonProperty("Gear15")
    public void setGear15(String gear15) {
        this.gear15 = gear15;
    }

    @JsonProperty("Gear16")
    public String getGear16() {
        return gear16;
    }

    @JsonProperty("Gear16")
    public void setGear16(String gear16) {
        this.gear16 = gear16;
    }

    @JsonProperty("XPChange")
    public String getXPChange() {
        return xPChange;
    }

    @JsonProperty("XPChange")
    public void setXPChange(String xPChange) {
        this.xPChange = xPChange;
    }

    @JsonProperty("Weapon3Crit")
    public String getWeapon3Crit() {
        return weapon3Crit;
    }

    @JsonProperty("Weapon3Crit")
    public void setWeapon3Crit(String weapon3Crit) {
        this.weapon3Crit = weapon3Crit;
    }

    @JsonProperty("Weapon3Range")
    public String getWeapon3Range() {
        return weapon3Range;
    }

    @JsonProperty("Weapon3Range")
    public void setWeapon3Range(String weapon3Range) {
        this.weapon3Range = weapon3Range;
    }

    @JsonProperty("SpellPerDay2")
    public String getSpellPerDay2() {
        return spellPerDay2;
    }

    @JsonProperty("SpellPerDay2")
    public void setSpellPerDay2(String spellPerDay2) {
        this.spellPerDay2 = spellPerDay2;
    }

    @JsonProperty("BonusSpells2")
    public String getBonusSpells2() {
        return bonusSpells2;
    }

    @JsonProperty("BonusSpells2")
    public void setBonusSpells2(String bonusSpells2) {
        this.bonusSpells2 = bonusSpells2;
    }

    @JsonProperty("SpellDC2")
    public String getSpellDC2() {
        return spellDC2;
    }

    @JsonProperty("SpellDC2")
    public void setSpellDC2(String spellDC2) {
        this.spellDC2 = spellDC2;
    }

    @JsonProperty("Feat19")
    public String getFeat19() {
        return feat19;
    }

    @JsonProperty("Feat19")
    public void setFeat19(String feat19) {
        this.feat19 = feat19;
    }

    @JsonProperty("Feat20")
    public String getFeat20() {
        return feat20;
    }

    @JsonProperty("Feat20")
    public void setFeat20(String feat20) {
        this.feat20 = feat20;
    }

    @JsonProperty("Feat8")
    public String getFeat8() {
        return feat8;
    }

    @JsonProperty("Feat8")
    public void setFeat8(String feat8) {
        this.feat8 = feat8;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
