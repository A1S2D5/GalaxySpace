package galaxyspace.systems.SolarSystem.planets.overworld.items.modules;

import galaxyspace.core.prefab.items.modules.ItemModule;
import galaxyspace.core.registers.items.GSItems;
import galaxyspace.core.util.GSUtils.Module_Type;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class Energy extends ItemModule {

	@Override
	public String getName() {
		return "energy";
	}

	@Override
	public ItemStack getIcon() {
		return new ItemStack(GSItems.ADVANCED_BATTERY, 1, GSItems.ADVANCED_BATTERY.getMaxDamage());
	}

	@Override
	public EntityEquipmentSlot getEquipmentSlot() {
		return null;
	}

	@Override
	public boolean isActiveModule() {
		return false;
	}

	@Override
	public ItemStack[] getItemsForModule() {
		return new ItemStack[] { new ItemStack(GSItems.ADVANCED_BATTERY, 1, GSItems.ADVANCED_BATTERY.getMaxDamage()) };
	}

	@Override
	public ItemModule[] getForrbidenModules() {
		return null;
	}

	@Override
	public Module_Type getType() {
		return Module_Type.SPACESUIT;
	}
}
