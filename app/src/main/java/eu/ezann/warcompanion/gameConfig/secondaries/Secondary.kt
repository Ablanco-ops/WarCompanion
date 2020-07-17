package eu.ezann.warcompanion.gameConfig.secondaries

import eu.ezann.warcompanion.R

data class Secondary(val secondId:Int, val title: Int, val category: Int, val type: Int) {

}
class SecondaryMissions {
    val purge = listOf(
        Secondary(11, R.string.secondary_purge_1,1, 1),
        Secondary(12, R.string.secondary_purge_2,1, 1),
        Secondary(13, R.string.secondary_purge_3,1, 1),
        Secondary(14, R.string.secondary_purge_4,1, 1)
    )
    val mercy = listOf(
        Secondary(21, R.string.secondary_mercy_1,2, 1),
        Secondary(22, R.string.secondary_mercy_2,2, 0),
        Secondary(23, R.string.secondary_mercy_3,2, 1),
        Secondary(24, R.string.secondary_mercy_4,2, 1)
    )
    val supremacy = listOf(
        Secondary(31, R.string.secondary_supremacy_1, 3, 0),
        Secondary(32, R.string.secondary_supremacy_2, 3, 0),
        Secondary(33, R.string.secondary_supremacy_3, 3, 0)
    )
    val operations = listOf(
        Secondary(41, R.string.secondary_operations_1,4,0),
        Secondary(42, R.string.secondary_operations_2,4,0),
        Secondary(43, R.string.secondary_operations_3,4,2)
    )
    val warpcraft = listOf(
        Secondary(51, R.string.secondary_warpcraft_1,5,0),
        Secondary(52, R.string.secondary_warpcraft_2,5,1),
        Secondary(53, R.string.secondary_warpcraft_3,5,1)
    )
    val missionSec = listOf(
        Secondary(611, R.string.secondary_missions1_1,6,0),
        Secondary(612, R.string.secondary_missions1_2,6,0),
        Secondary(613, R.string.secondary_missions1_3,6,0),

        Secondary(621, R.string.secondary_missions2_1,6,0),
        Secondary(622, R.string.secondary_missions2_2,6,0),
        Secondary(623, R.string.secondary_missions2_3,6,0),
        Secondary(624, R.string.secondary_missions2_4,6,0),
        Secondary(625, R.string.secondary_missions2_5,6,0),
        Secondary(626, R.string.secondary_missions2_6,6,0),

        Secondary(631, R.string.secondary_missions3_1,6,1),
        Secondary(632, R.string.secondary_missions3_2,6,0),
        Secondary(633, R.string.secondary_missions3_3,6,0),
        Secondary(634, R.string.secondary_missions3_4,6,0),
        Secondary(635, R.string.secondary_missions3_5,6,1),
        Secondary(636, R.string.secondary_missions3_6,6,0),

        Secondary(641, R.string.secondary_missions4_1,6,0),
        Secondary(642, R.string.secondary_missions4_2,6,2),
        Secondary(643, R.string.secondary_missions4_3,6,0)
    )
    val allSecondaries = listOf<Secondary>(
        Secondary(11, R.string.secondary_purge_1,1, 1),
        Secondary(12, R.string.secondary_purge_2,1, 1),
        Secondary(13, R.string.secondary_purge_3,1, 1),
        Secondary(14, R.string.secondary_purge_4,1, 1),
        Secondary(21, R.string.secondary_mercy_1,2, 1),
        Secondary(22, R.string.secondary_mercy_2,2, 0),
        Secondary(23, R.string.secondary_mercy_3,2, 1),
        Secondary(24, R.string.secondary_mercy_4,2, 1),
        Secondary(31, R.string.secondary_supremacy_1, 3, 0),
        Secondary(32, R.string.secondary_supremacy_2, 3, 0),
        Secondary(33, R.string.secondary_supremacy_3, 3, 0),
        Secondary(41, R.string.secondary_operations_1,4,0),
        Secondary(42, R.string.secondary_operations_2,4,0),
        Secondary(43, R.string.secondary_operations_3,4,2),
        Secondary(51, R.string.secondary_warpcraft_1,5,0),
        Secondary(52, R.string.secondary_warpcraft_2,5,1),
        Secondary(53, R.string.secondary_warpcraft_3,5,1),

        Secondary(611, R.string.secondary_missions1_1,6,0),
        Secondary(612, R.string.secondary_missions1_2,6,0),
        Secondary(613, R.string.secondary_missions1_3,6,0),

        Secondary(621, R.string.secondary_missions2_1,6,0),
        Secondary(622, R.string.secondary_missions2_2,6,0),
        Secondary(623, R.string.secondary_missions2_3,6,0),
        Secondary(624, R.string.secondary_missions2_4,6,0),
        Secondary(625, R.string.secondary_missions2_5,6,0),
        Secondary(626, R.string.secondary_missions2_6,6,0),

        Secondary(631, R.string.secondary_missions3_1,6,1),
        Secondary(632, R.string.secondary_missions3_2,6,0),
        Secondary(633, R.string.secondary_missions3_3,6,0),
        Secondary(634, R.string.secondary_missions3_4,6,0),
        Secondary(635, R.string.secondary_missions3_5,6,1),
        Secondary(636, R.string.secondary_missions3_6,6,0),

        Secondary(641, R.string.secondary_missions4_1,6,0),
        Secondary(642, R.string.secondary_missions4_2,6,2),
        Secondary(643, R.string.secondary_missions4_3,6,0)
    )
}