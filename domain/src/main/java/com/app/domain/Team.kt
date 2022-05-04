package com.app.domain


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class Team(
    @SerializedName("idAPIfootball")
    val idAPIfootball: String,
    @SerializedName("idLeague")
    val idLeague: String,
    @SerializedName("idLeague2")
    val idLeague2: String,
    @SerializedName("idLeague3")
    val idLeague3: @RawValue Any?,
    @SerializedName("idLeague4")
    val idLeague4: @RawValue Any?,
    @SerializedName("idLeague5")
    val idLeague5: @RawValue Any?,
    @SerializedName("idLeague6")
    val idLeague6: @RawValue Any?,
    @SerializedName("idLeague7")
    val idLeague7: @RawValue Any?,
    @SerializedName("idSoccerXML")
    val idSoccerXML: String,
    @SerializedName("idTeam")
    val idTeam: String,
    @SerializedName("intFormedYear")
    val intFormedYear: String,
    @SerializedName("intLoved")
    val intLoved: @RawValue Any?,
    @SerializedName("intStadiumCapacity")
    val intStadiumCapacity: String,
    @SerializedName("strAlternate")
    val strAlternate: String,
    @SerializedName("strCountry")
    val strCountry: String,
    @SerializedName("strDescriptionCN")
    val strDescriptionCN: @RawValue Any?,
    @SerializedName("strDescriptionDE")
    val strDescriptionDE: @RawValue Any?,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String,
    @SerializedName("strDescriptionES")
    val strDescriptionES: String,
    @SerializedName("strDescriptionFR")
    val strDescriptionFR: @RawValue Any?,
    @SerializedName("strDescriptionHU")
    val strDescriptionHU: @RawValue Any?,
    @SerializedName("strDescriptionIL")
    val strDescriptionIL: @RawValue Any?,
    @SerializedName("strDescriptionIT")
    val strDescriptionIT: String,
    @SerializedName("strDescriptionJP")
    val strDescriptionJP: @RawValue Any?,
    @SerializedName("strDescriptionNL")
    val strDescriptionNL: @RawValue Any?,
    @SerializedName("strDescriptionNO")
    val strDescriptionNO: @RawValue Any?,
    @SerializedName("strDescriptionPL")
    val strDescriptionPL: @RawValue Any?,
    @SerializedName("strDescriptionPT")
    val strDescriptionPT: @RawValue Any?,
    @SerializedName("strDescriptionRU")
    val strDescriptionRU: @RawValue Any?,
    @SerializedName("strDescriptionSE")
    val strDescriptionSE: @RawValue Any?,
    @SerializedName("strDivision")
    val strDivision: @RawValue Any?,
    @SerializedName("strFacebook")
    val strFacebook: String,
    @SerializedName("strGender")
    val strGender: String,
    @SerializedName("strInstagram")
    val strInstagram: String,
    @SerializedName("strKeywords")
    val strKeywords: String,
    @SerializedName("strKitColour1")
    val strKitColour1: @RawValue Any?,
    @SerializedName("strKitColour2")
    val strKitColour2: @RawValue Any?,
    @SerializedName("strKitColour3")
    val strKitColour3: @RawValue Any?,
    @SerializedName("strLeague")
    val strLeague: String,
    @SerializedName("strLeague2")
    val strLeague2: String,
    @SerializedName("strLeague3")
    val strLeague3: String,
    @SerializedName("strLeague4")
    val strLeague4: String,
    @SerializedName("strLeague5")
    val strLeague5: String,
    @SerializedName("strLeague6")
    val strLeague6: String,
    @SerializedName("strLeague7")
    val strLeague7: String,
    @SerializedName("strLocked")
    val strLocked: String,
    @SerializedName("strManager")
    val strManager: String,
    @SerializedName("strRSS")
    val strRSS: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("strStadium")
    val strStadium: String,
    @SerializedName("strStadiumDescription")
    val strStadiumDescription: String,
    @SerializedName("strStadiumLocation")
    val strStadiumLocation: String,
    @SerializedName("strStadiumThumb")
    val strStadiumThumb: String,
    @SerializedName("strTeam")
    val strTeam: String,
    @SerializedName("strTeamBadge")
    val strTeamBadge: String,
    @SerializedName("strTeamBanner")
    val strTeamBanner: String,
    @SerializedName("strTeamFanart1")
    val strTeamFanart1: String,
    @SerializedName("strTeamFanart2")
    val strTeamFanart2: String,
    @SerializedName("strTeamFanart3")
    val strTeamFanart3: String,
    @SerializedName("strTeamFanart4")
    val strTeamFanart4: String,
    @SerializedName("strTeamJersey")
    val strTeamJersey: String,
    @SerializedName("strTeamLogo")
    val strTeamLogo: String,
    @SerializedName("strTeamShort")
    val strTeamShort: @RawValue Any?,
    @SerializedName("strTwitter")
    val strTwitter: String,
    @SerializedName("strWebsite")
    val strWebsite: String,
    @SerializedName("strYoutube")
    val strYoutube: String
): Parcelable