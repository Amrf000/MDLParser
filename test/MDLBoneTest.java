

import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Test;

import io.github.picoledelimao.mdl.MDLBone;
import io.github.picoledelimao.mdl.core.MDLNotFoundException;
import io.github.picoledelimao.mdl.core.MDLParserErrorException;

public class MDLBoneTest {

	@Test
	public void test() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, MDLNotFoundException, MDLParserErrorException {
		String s1 = "Bone \"bone_FootL2\" {\n\tObjectId 0,\n\tParent 3,\n\tGeosetId Multiple,\n\tGeosetAnimId None,\n\tRotation 38 {\n\t\tLinear,\n\t\t100: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t850: { -0.0810547, -0.269531, 0.0012207, 0.957031 },\n\t\t1600: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t4000: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t4165: { -0.074707, -0.380859, 0.0373535, 0.917969 },\n\t\t4247: { -0.0698242, -0.357422, 0.0341797, 0.929688 },\n\t\t4396: { -0.0722656, -0.390625, 0.0272217, 0.914063 },\n\t\t4481: { -0.0805664, -0.40625, 0.0247803, 0.90625 },\n\t\t4574: { -0.0913086, -0.423828, 0.0227051, 0.898438 },\n\t\t5000: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t5100: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t5850: { -0.0810547, -0.269531, 0.0012207, 0.957031 },\n\t\t6600: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t7000: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t7217: { -0.074707, -0.380859, 0.0373535, 0.917969 },\n\t\t7500: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7548: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7575: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7607: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7801: { -0.0303955, -0.0603027, 0.0327148, 0.996094 },\n\t\t7858: { -0.0303955, -0.0603027, 0.0327148, 0.996094 },\n\t\t7901: { -0.0791016, -0.289063, 0.0125122, 0.953125 },\n\t\t8000: { -0.00570679, 0.0373535, 0.026123, 0.996094 },\n\t\t8100: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t8326: { -0.152344, -0.462891, 0.00325012, 0.871094 },\n\t\t8566: { -0.151367, -0.462891, 0.00323486, 0.871094 },\n\t\t8764: { -0.151367, -0.462891, 0.00323486, 0.871094 },\n\t\t8886: { -0.0708008, -0.242188, 0.000671387, 0.964844 },\n\t\t8992: { -0.0154419, -0.090332, -0.00102234, 0.992188 },\n\t\t9100: { 0.026001, 0.0240479, -0.0022583, 0.996094 },\n\t\t9200: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t9442: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9579: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9600: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9675: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9747: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9867: { -0.124023, -0.384766, -0.0100708, 0.914063 },\n\t\t10200: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t}\n}\n";
		MDLBone bone1 = new MDLBone();
		bone1.parse(s1);
		Assert.assertEquals(s1, bone1.toMDL());
		bone1.setGeosetAnimId(0);
		bone1.setGeosetId(0);
		String s2 = "Bone \"bone_FootL2\" {\n\tObjectId 0,\n\tParent 3,\n\tGeosetId 0,\n\tGeosetAnimId 0,\n\tRotation 38 {\n\t\tLinear,\n\t\t100: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t850: { -0.0810547, -0.269531, 0.0012207, 0.957031 },\n\t\t1600: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t4000: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t4165: { -0.074707, -0.380859, 0.0373535, 0.917969 },\n\t\t4247: { -0.0698242, -0.357422, 0.0341797, 0.929688 },\n\t\t4396: { -0.0722656, -0.390625, 0.0272217, 0.914063 },\n\t\t4481: { -0.0805664, -0.40625, 0.0247803, 0.90625 },\n\t\t4574: { -0.0913086, -0.423828, 0.0227051, 0.898438 },\n\t\t5000: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t5100: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t5850: { -0.0810547, -0.269531, 0.0012207, 0.957031 },\n\t\t6600: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t7000: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t7217: { -0.074707, -0.380859, 0.0373535, 0.917969 },\n\t\t7500: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7548: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7575: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7607: { -0.0275879, -0.0446777, 0.036377, 0.996094 },\n\t\t7801: { -0.0303955, -0.0603027, 0.0327148, 0.996094 },\n\t\t7858: { -0.0303955, -0.0603027, 0.0327148, 0.996094 },\n\t\t7901: { -0.0791016, -0.289063, 0.0125122, 0.953125 },\n\t\t8000: { -0.00570679, 0.0373535, 0.026123, 0.996094 },\n\t\t8100: { -0.0549316, -0.199219, 0.000366211, 0.976563 },\n\t\t8326: { -0.152344, -0.462891, 0.00325012, 0.871094 },\n\t\t8566: { -0.151367, -0.462891, 0.00323486, 0.871094 },\n\t\t8764: { -0.151367, -0.462891, 0.00323486, 0.871094 },\n\t\t8886: { -0.0708008, -0.242188, 0.000671387, 0.964844 },\n\t\t8992: { -0.0154419, -0.090332, -0.00102234, 0.992188 },\n\t\t9100: { 0.026001, 0.0240479, -0.0022583, 0.996094 },\n\t\t9200: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t\t9442: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9579: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9600: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9675: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9747: { 0.000637054, -0.0444336, -0.00159454, 0.996094 },\n\t\t9867: { -0.124023, -0.384766, -0.0100708, 0.914063 },\n\t\t10200: { -0.0839844, -0.277344, 0.00131226, 0.953125 },\n\t}\n}\n";
		Assert.assertEquals(s2, bone1.toMDL());
		String s3 = "Bone \"bone_FootR2\" {\n\tObjectId 1,\n\tParent 2,\n\tGeosetId 1,\n\tGeosetAnimId None,\n\tRotation 26 {\n\t\tLinear,\n\t\t7000: { -0.0478516, -0.111816, 0.0212402, 0.992188 },\n\t\t7217: { -0.0244141, -0.133789, 0.0181885, 0.988281 },\n\t\t7264: { 0.0473633, -0.332031, 0.00970459, 0.941406 },\n\t\t7500: { 0.022583, -0.177734, 0.0119019, 0.980469 },\n\t\t7548: { 0.0291748, -0.183594, 0.0110474, 0.980469 },\n\t\t7575: { 0.0332031, -0.1875, 0.010498, 0.980469 },\n\t\t7607: { 0.0373535, -0.191406, 0.00994873, 0.980469 },\n\t\t7801: { 0.0644531, -0.21582, 0.00628662, 0.972656 },\n\t\t7858: { 0.0644531, -0.21582, 0.00628662, 0.972656 },\n\t\t7901: { 0.078125, -0.228516, 0.00442505, 0.96875 },\n\t\t8000: { -0.0478516, -0.111816, 0.0212402, 0.992188 },\n\t\t8100: { 0, 0, 0, 1 },\n\t\t8326: { 0.176758, -0.550781, 0.0196533, 0.8125 },\n\t\t8566: { 0.176758, -0.550781, 0.0195313, 0.8125 },\n\t\t8764: { 0.176758, -0.550781, 0.0195313, 0.8125 },\n\t\t8886: { 0.102051, -0.318359, 0.0130615, 0.941406 },\n\t\t8992: { 0.0493164, -0.155273, 0.00830078, 0.984375 },\n\t\t9100: { 0.00897217, -0.03125, 0.00457764, 0.996094 },\n\t\t9200: { 0, 0, 0, 1 },\n\t\t9442: { 0, 0, 0, 1 },\n\t\t9579: { 0, 0, 0, 1 },\n\t\t9600: { 0, 0, 0, 1 },\n\t\t9675: { 0, 0, 0, 1 },\n\t\t9747: { 0, 0, 0, 1 },\n\t\t9867: { 0, 0, 0, 1 },\n\t\t10200: { 0, 0, 0, 1 },\n\t}\n}\n";
		bone1.parse(s3);
		Assert.assertEquals(s3, bone1.toMDL());
		String s4 = "Bone \"bone_FootR\" {\n\tObjectId 2,\n\tParent 4,\n\tGeosetId 1,\n\tGeosetAnimId None,\n\tRotation 46 {\n\t\tLinear,\n\t\t0: { 0, 0, 0, 1 },\n\t\t100: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t850: { 0.000686646, 0.109863, 0.0020752, 0.992188 },\n\t\t1600: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t2000: { 0, 0.199219, 0, 0.976563 },\n\t\t2166: { 0.0405273, 0.060791, -0.0158691, 0.996094 },\n\t\t2333: { 0.0334473, -0.298828, 0.0098877, 0.953125 },\n\t\t2500: { 0, 0.283203, 0, 0.957031 },\n\t\t2666: { 0, 0.265625, 0, 0.960938 },\n\t\t2800: { 0, 0.244141, -0.0000009984, 0.96875 },\n\t\t3000: { 0, 0.199219, 0, 0.976563 },\n\t\t4000: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t4165: { 0.109375, -0.227539, -0.00187683, 0.964844 },\n\t\t4247: { 0.12207, -0.267578, -0.00234985, 0.953125 },\n\t\t4396: { 0.11084, -0.226563, -0.00136566, 0.964844 },\n\t\t4481: { 0.150391, -0.217773, 0.00793457, 0.960938 },\n\t\t5000: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t5100: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t5850: { 0.000686646, 0.109863, 0.0020752, 0.992188 },\n\t\t6600: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t7000: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t7217: { 0.109375, -0.227539, -0.00187683, 0.964844 },\n\t\t7264: { -0.0174561, 0.166016, 0.00282288, 0.984375 },\n\t\t7500: { -0.0554199, 0.28125, 0.00424194, 0.957031 },\n\t\t7548: { -0.0554199, 0.28125, 0.00424194, 0.957031 },\n\t\t7575: { -0.0554199, 0.28125, 0.00424194, 0.957031 },\n\t\t7607: { -0.0554199, 0.28125, 0.00424194, 0.957031 },\n\t\t7801: { -0.00909424, 0.147461, 0.00186157, 0.988281 },\n\t\t7858: { -0.00909424, 0.147461, 0.00186157, 0.988281 },\n\t\t7901: { 0.0400391, 0.00105286, -0.000881195, 0.996094 },\n\t\t8000: { 0.120605, -0.263672, -0.0090332, 0.953125 },\n\t\t8100: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t8326: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t8566: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t8764: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t8886: { -0.0371094, 0.222656, 0.00245667, 0.972656 },\n\t\t8992: { -0.0683594, 0.314453, 0.00292969, 0.945313 },\n\t\t9100: { -0.0908203, 0.380859, 0.00325012, 0.917969 },\n\t\t9200: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t\t9442: { -0.0712891, 0.333984, 0.0332031, 0.9375 },\n\t\t9579: { -0.0620117, 0.3125, 0.0654297, 0.941406 },\n\t\t9600: { -0.0620117, 0.3125, 0.0654297, 0.941406 },\n\t\t9675: { -0.000972748, 0.138672, 0.0581055, 0.988281 },\n\t\t9747: { 0.0297852, 0.0288086, 0.0510254, 0.996094 },\n\t\t9867: { 0.0186768, -0.138672, 0.0373535, 0.988281 },\n\t\t10200: { 0.0115356, 0.0766602, 0.00169373, 0.996094 },\n\t}\n}\n";
		bone1.parse(s4);
		Assert.assertEquals(s4, bone1.toMDL());
		String s5 = "Bone \"bone_Head\" {\n\tObjectId 10,\n\tParent 14,\n\tGeosetId 0,\n\tGeosetAnimId 0,\n\tDontInherit { Translation, Rotation, Scaling },\n\tBillboarded,\n\tBillboardedLockX,\n\tBillboardedLockY,\n\tBillboardedLockZ,\n\tCameraAnchored,\n\tRotation 46 {\n\t\tLinear,\n\t\t0: { 0, 0, 0, 1 },\n\t\t100: { 0.0129395, -0.12207, 0.119629, 0.984375 },\n\t\t850: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t\t1600: { 0.0129395, -0.12207, 0.119629, 0.984375 },\n\t\t2000: { -0.106934, -0.231445, 0.102051, 0.960938 },\n\t\t2166: { -0.045166, -0.192383, 0.0273438, 0.976563 },\n\t\t2333: { 0.0527344, -0.191406, -0.0432129, 0.976563 },\n\t\t2500: { 0.0996094, -0.226563, -0.105469, 0.960938 },\n\t\t2666: { 0.0241699, -0.19043, -0.0644531, 0.976563 },\n\t\t2800: { -0.0600586, -0.192383, 0.0390625, 0.976563 },\n\t\t3000: { -0.106934, -0.231445, 0.102051, 0.960938 },\n\t\t4000: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t\t4165: { 0.00436401, -0.228516, 0.123047, 0.964844 },\n\t\t4247: { 0.00436401, -0.228516, 0.123047, 0.964844 },\n\t\t4396: { 0.00891113, -0.188477, 0.11084, 0.972656 },\n\t\t4481: { 0.0834961, -0.155273, -0.125, 0.972656 },\n\t\t4819: { 0.0458984, -0.112305, -0.0251465, 0.992188 },\n\t\t5000: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t\t5100: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t\t5850: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t\t6600: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t\t7000: { 0.0129395, -0.12207, 0.119629, 0.984375 },\n\t\t7217: { -0.013916, -0.601563, -0.0116577, 0.792969 },\n\t\t7500: { -0.00650024, 0.143555, -0.0405273, 0.988281 },\n\t\t7548: { -0.00830078, 0.0000624657, -0.0366211, 0.996094 },\n\t\t7575: { -0.00631714, 0.157227, -0.0407715, 0.984375 },\n\t\t7607: { -0.00662231, 0.134766, -0.0402832, 0.988281 },\n\t\t7801: { -0.00518799, 0.0913086, -0.0236816, 0.992188 },\n\t\t7858: { -0.00518799, 0.0913086, -0.0236816, 0.992188 },\n\t\t7901: { -0.0000805855, -0.0639648, 0.0351563, 0.996094 },\n\t\t8000: { 0.00100708, -0.081543, 0.0349121, 0.992188 },\n\t\t8100: { 0.0129395, -0.12207, 0.119629, 0.984375 },\n\t\t8326: { 0.0366211, -0.271484, 0.11377, 0.953125 },\n\t\t8566: { -0.0253906, 0.118164, 0.121094, 0.984375 },\n\t\t8764: { -0.0466309, 0.251953, 0.118652, 0.957031 },\n\t\t8886: { -0.043457, 0.163086, -0.0844727, 0.980469 },\n\t\t8992: { -0.0400391, 0.100098, -0.213867, 0.96875 },\n\t\t9100: { -0.0371094, 0.052002, -0.308594, 0.945313 },\n\t\t9200: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t\t9442: { 0.0390625, -0.0644531, -0.154297, 0.984375 },\n\t\t9579: { 0.0869141, 0.0424805, -0.231445, 0.964844 },\n\t\t9600: { 0.0869141, 0.0424805, -0.231445, 0.964844 },\n\t\t9675: { -0.0317383, 0.0444336, -0.10791, 0.992188 },\n\t\t9747: { -0.12793, -0.0927734, 0.0244141, 0.984375 },\n\t\t9867: { 0.125977, -0.300781, 0.09375, 0.9375 },\n\t\t10200: { 0.00753784, -0.0874023, 0.120605, 0.988281 },\n\t}\n}\n";
		bone1.parse(s5);
		Assert.assertEquals(s5, bone1.toMDL());
		MDLBone bone2 = new MDLBone();
		String s6 = "Bone \"Glow\" {\n\tObjectId 11,\n\tGeosetId Multiple,\n\tGeosetAnimId None,\n\tTranslation 1 {\n\t\tDontInterp,\n\t\t0: { 0, 0, 0 },\n\t}\n\tRotation 1 {\n\t\tDontInterp,\n\t\t0: { 0, 0, 0, 1 },\n\t}\n\tScaling 1 {\n\t\tDontInterp,\n\t\t0: { 1, 1, 1 },\n\t}\n}\n";
		bone2.parse(s6);
		Assert.assertEquals(s6, bone2.toMDL());
	}

}